var SoftNavigationCheck = (function() {

    var SoftNavigationCheck = {};

    SoftNavigationCheck.isSoftNavigationAvailable = function(success, error) {
        return cordova.exec(success, error, "SoftNavigationCheck", "isSoftNavigationAvailable", []);
    };

    SoftNavigationCheck.navigationBarHeight = function(success, error) {
        return cordova.exec(success, error, "SoftNavigationCheck", "navigationBarHeight", []);
    };

    return SoftNavigationCheck;
});

module.exports = new SoftNavigationCheck();