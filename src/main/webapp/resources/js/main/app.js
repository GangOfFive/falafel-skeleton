'use strict';
angular.module('falafel', [
    'falafel.services'
])
.config(function($routeProvider, $provide, $httpProvider) {
    $routeProvider.otherwise({
        redirectTo : '/'
    });

    // RESPONSE INTERCEPTOR FOR ALL THE ANGULAR CALLS
    $provide.factory('responseHttpInterceptor', function($q) {
        return function(promise) {
            return promise.then(function(response) {
                // do something on success
                return response;
            }, function(response) {
                // do something on error
                if (response.status === 401) {
                    window.location.href = "/sima/#/login";
                }
                return $q.reject(response);
            });
        };
    });

});