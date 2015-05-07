(function(){

	var fuzzyApp = angular.module('fuzzyApp', []);
	fuzzyApp.controller('FuzzyController', function() {
		this.user = fooUser;
	});

	var fooUser = {
		name : 'Foo',
		pswd : 'bar',
		decription : 'Lorem ipsum dolor sit amet, consectetur adipiscing elit.'
	}
})();