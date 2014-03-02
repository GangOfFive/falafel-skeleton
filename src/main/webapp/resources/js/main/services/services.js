/*global localStorage */

angular.module('falafel.services', [])
    .factory('storage', function () {
        return {
            set: function (key, val) {
                localStorage.setItem(key, angular.toJson(val));
            },
            get: function (key) {
                return angular.fromJson(localStorage.getItem(key));
            }
        };
    });