'use strict';

angular.module('falafelLogin', [
    'falafelLogin.controllers',
    'falafel.services'
])

.config(function($routeProvider) {

    $routeProvider.when('/login', {
        templateUrl : 'layoutservice/loginlayout',
        controller : 'LoginCtrl'
    });

    $routeProvider.otherwise({
        redirectTo : '/login'
    });
});