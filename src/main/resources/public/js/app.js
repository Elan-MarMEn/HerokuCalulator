app = (function () {
    function addnumber(){
       var num = $("#numadd").val();
        appclient.addnumber(num);
    }

    function getList(){
         appclient.getList(showList);
    }

    function showList(data){
        var i=0;
        var temp= "";
        $(".sub_setNumber").remove();
        while(i != data.length){
            if(data[i] == ","){
                var setNumber = "<tr class='sub_setNumber'><th>"+ temp +"</th></tr>"
                $('#setNumber').append(setNumber);
                temp = "";
            }else{
                temp += data[i];
            }
            i+=1;
        }
    }

    function getMean(){
        appclient.getMean(showMean);
    }

    function showMean(data){
        $(".sub_addition").remove();
        $("#resultMean").append("<span class='sub_addition' style='font-weight:bolder;'>Mean:"+data+"</span>");
    }

    function getDev(){
        appclient.getDev(showDev);
    }

    function showDev(data){
        $(".sub_addition").remove();
        $("#resultDev").append("<span class='sub_addition' style='font-weight:bolder;'>Mean:"+data+"</span>");
    }



    return{
        addnumber:addnumber,
        getList:getList,
        getMean:getMean,
        getDev:getDev
    }
})();