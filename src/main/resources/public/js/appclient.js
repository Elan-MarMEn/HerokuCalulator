appclient = (function () {
    function addnumber(num,callback){
        var promise = $.post({
                url: "/add/"+ num,
                data: JSON.stringify(num),
                contentType: "application/json"
            });
            promise.then(function(data){
            }, function(error) {
                alert("Try again")
            });
    }

    function getList(callback){
        var promise = $.get({
                url: "/list",
                contentType: "application/json"
            });
            promise.then(function(data){
                callback(data);
            }, function(error) {
                callback("Failed");
            });
    }

    function getMean(callback){
        var promise = $.get({
            url: "/mean",
            contentType: "application/json"
        });
        promise.then(function(data){
            callback(data);
        }, function(error) {
            callback("Failed");
        });
    }

    function getDev(callback){
        var promise = $.get({
            url: "/deviation",
            contentType: "application/json"
        });
        promise.then(function(data){
            callback(data);
        }, function(error) {
            callback("Failed");
        });
    }
    

    return{
        addnumber:addnumber,
        getList:getList,
        getMean:getMean,
        getDev:getDev
    }
})();