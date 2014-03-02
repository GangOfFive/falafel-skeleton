angular.module('falafelLogin.controllers', ['falafel.services'])

.controller('LoginCtrl', function($scope, $http, $location, storage) {

    $scope.user = {
        email: 'andres@villarreal.co.cr',
        password: 'test123'
    };

    $scope.checkLogin = function() {
        $http.post('rest/login/checkuser', $scope.user).success(function(loginResponse) {
            if (loginResponse.code == 200) {
                storage.set('user', {
                    idUser: loginResponse.id,
                    firstName: loginResponse.firstName,
                    lastName: loginResponse.lastName
                });

                window.location.href = '/sima/app';
            }
        });
    };
});