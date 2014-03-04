'use strict';

var falafel = {};

var App = angular.module('falafel', ['falafel.filters', 'falafel.services',
      'falafel.directives']);

// Declare app level module which depends on filters, and services
App.config(function ($routeProvider,$provide,$httpProvider) {
	
	$routeProvider.when('/users', {
        templateUrl: 'layoutservice/userslayout',
        controller: UsersController
    });
	$routeProvider.otherwise({redirectTo: '/users'});
	//RESPONSE INTERCEPTOR FOR ALL THE ANGULAR CALLS
	$provide.factory('responseHttpInterceptor', ['$q', function($q) {
		return function(promise) {
			return promise.then(function(response) {
				// do something on success
				return response;
			}, function(response) {
				// do something on error
				if(response.status === 401){
					window.location.href = "/sima/#/login";
				}
				return $q.reject(response);
			});
		};
	}]);
	$httpProvider.responseInterceptors.push('responseHttpInterceptor');
	//RESPONSE INTERCEPTOR FOR ALL THE JQUERY CALLS: EX:THE JQGRID
	$.ajaxSetup({
	    beforeSend: function() {
	    },
	    complete: function(response) {
	    	if(response.status === 401){
				window.location.href = "/sima/#/login";
			}
	    }
	});
	
});