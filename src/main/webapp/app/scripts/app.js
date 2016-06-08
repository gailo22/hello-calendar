'use strict';

/**
 * @ngdoc overview
 * @name helloCalendarApp
 * @description
 * # helloCalendarApp
 *
 * Main module of the application.
 */
angular
  .module('helloCalendarApp', [
    'ngAnimate',
    'ngCookies',
    'ngResource',
    'ngRoute',
    'ngSanitize',
    'ngTouch'
  ])
  .config(function ($routeProvider) {
    $routeProvider
      .when('/', {
        templateUrl: 'views/main.html',
        controller: 'MainCtrl',
        controllerAs: 'main'
      })
      .otherwise({
        redirectTo: '/'
      });
  });
