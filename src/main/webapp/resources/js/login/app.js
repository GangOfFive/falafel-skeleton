'use strict';

angular.module('falafelLogin', [
    'falafelLogin.controllers',
    'falafel.services'
])

.config(function($routeProvider) {

    $routeProvider.when('/login', {
        templateUrl : 'layouts/login',
        controller : 'LoginCtrl'
    });

    $routeProvider.otherwise({
        redirectTo : '/login'
    });
});