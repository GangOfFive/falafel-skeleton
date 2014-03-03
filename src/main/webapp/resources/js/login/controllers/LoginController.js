angular.module('falafelLogin.controllers', [])

.controller('LoginCtrl', function($scope, $http, $location) {
	angular.element('#invalid_message').hide();
	
    $scope.user = {
        email : '',
        password : ''
    };
    
    $scope.init = function() {
    	
    };

    $scope.checkLogin = function() {
        $http.post('rest/login/checkuser', $scope.user).success(function(loginResponse) {
            
        	switch(loginResponse.code) {
            case 200:
            	var usuario = {
                    idUser: loginResponse.idUsuario,
                    firstName: loginResponse.firstName,
                    lastName: loginResponse.lastName
                };
                $.jStorage.set('user', usuario);

                window.location.href = '/sima/app#/users';
            	break;
            	
            case 401:
            	angular.element('#invalid_message').show();
            	break;
            	
        	// For any other codes (ie. 500 Internal Server Error);
            default:
            	console.log(loginResponse);
            }
        });
    };
    
    $scope.init();
});