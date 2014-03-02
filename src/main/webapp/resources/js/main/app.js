'use strict';

//var falafel = {};

var App = angular.module('falafel', ['falafel.filters', 'falafel.services',
    'falafel.directives']);

// Declare app level module which depends on filters, and services
App.config(function ($routeProvider) {
    $routeProvider.when('/users', {
        templateUrl: 'layoutservice/userslayout',
        controller: UsersController
    })

        .when('/rent/available', {
            templateUrl: 'layoutservice/rent/list',
            controller: RentListController
        })

        .when('/rent/my', {
            templateUrl: 'layoutservice/rent/do',
            controller: UserRentController
        })

        .when('/rent/create', {
            templateUrl: 'layoutservice/rent/create',
            controller: RentController
        })

    .otherwise({redirectTo: '/users'});
});