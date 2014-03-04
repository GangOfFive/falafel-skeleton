angular.module('falafelLogin.controllers', ['falafelCommon.services'])

.controller('LoginCtrl', function($scope, $http, $window, storage) {

    $scope.user = {
        email: 'admin@falafel.io',
        contrasena: 'test123'
    };

    $scope.checkLogin = function() {
        $http.post('rest/login/check-user', $scope.user).success(function(response) {

            if (response.code == 200) {
                
                storage.set('usuario', {
                    id: response.id,
                    primerNombre: response.primerNombre,
                    segundoNombre: response.segundoNombre,
                    email: response.email
                });

                $window.location.pathname += 'app';
            }
        });
    };
});