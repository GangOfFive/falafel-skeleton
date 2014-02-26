'use strict';

angular.module('falafelLogin', [
    'falafelLogin.controllers'
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