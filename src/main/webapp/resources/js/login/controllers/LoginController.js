angular.module('falafelLogin.controllers', [])

.controller('LoginCtrl', function($scope, $http, $location) {

    $scope.user = {
        email : 'gerardo@parajeles.com',
        password : 'maruja'
    };

    $scope.checkLogin = function() {
        $http.post('rest/login/checkuser', $scope.user).success(function(loginResponse) {
            if (loginResponse.code == 200) {
                var usuario = {
                    idUser: loginResponse.idUsuario,
                    firstName: loginResponse.firstName,
                    lastName: loginResponse.lastName
                };

                localStorage.setItem('user', usuario);

                window.location.href = '/sima/app';
            }
        });
    };
});