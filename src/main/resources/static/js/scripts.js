function moviesList(){
    var body = document.getElementById("movietable");
    body.innerHTML = "";
    var row = body.insertRow(0);
            var cell1 = row.insertCell(0);
            var cell2 = row.insertCell(1);
            var cell3 = row.insertCell(2);
            var cell4 = row.insertCell(3);
            var cell5 = row.insertCell(4);
            var cell6 = row.insertCell(5);
            var cell7 = row.insertCell(6);
            var cell8 = row.insertCell(7);
            var cell9 = row.insertCell(8);
            var cell10 = row.insertCell(9);
            var cell11 = row.insertCell(10);
            var cell12 = row.insertCell(11);
            var cell13 = row.inserCell(12);
            cell1.innerHTML = "Movie Id";
            cell2.innerHTML = "Movie Name";
            cell3.innerHTML = "Number of Copies";
            cell4.innerHTML = "Genre";
            cell5.innerHTML = "Average User Rating";
            cell6.innerHTML = "Number of User Reviews";
            cell7.innerHTML = "MPAA Rating";
            cell8.innerHTML = "Release Date";
            cell9.innerHTML = "Main Actor";
            cell10.innerHTML = "Supporting Actor";
            cell11.innerHTML = "Director";
            cell12.innerHTML = "Runtime";
            cell13.innerHTML = "Purchase Cost";
   var xhttp = new XMLHttpRequest();
   var searchName = document.getElementById("search").value;
   var url = "http://localhost:8181/movies/";
   if(searchName){
    url = url + searchName;
   }
   xhttp.open("GET", url, true);
   xhttp.setRequestHeader('Content-type', 'application/json');
   xhttp.onreadystatechange = function() {
      if (this.readyState == 4 && this.status == 200) {
   
         // Response
        var response = this.responseText; 
        var movies = JSON.parse(response);
        var table = document.getElementById("movietable");
        var index = 1;

        if(response != null && response != "[null]"){
            for(var i = 0; i < movies.length; i++){
                var obj = movies[i];
                var row = table.insertRow(index);
                var cell1 = row.insertCell(0);
                var cell2 = row.insertCell(1);
                var cell3 = row.insertCell(2);
                var cell4 = row.insertCell(3);
                var cell5 = row.insertCell(4);
                var cell6 = row.insertCell(5);
                var cell7 = row.insertCell(6);
                var cell8 = row.insertCell(7);
                var cell9 = row.insertCell(8);
                var cell10 = row.insertCell(9);
                var cell11 = row.insertCell(10);
                var cell12 = row.insertCell(11);
                var cell13 = row.inserCell(12);
                cell1.innerHTML = obj["movieID"];
                cell2.innerHTML = obj["movieName"];
                cell3.innerHTML = obj["numberOfCopies"];
                cell4.innerHTML = obj["genre"]
                // cell5.innerHTML = "Average User Rating";
                // cell6.innerHTML = "Number of User Reviews";
                // cell7.innerHTML = "MPAA Rating";
                // cell8.innerHTML = "Release Date";
                // cell9.innerHTML = "Main Actor";
                // cell10.innerHTML = "Supporting Actor";
                // cell11.innerHTML = "Director";
                // cell12.innerHTML = "Runtime";
                // cell13.innerHTML = "Purchase Cost";

                //[{"movieName":"test","movieCost":12.0,"runtime":123,"averageUserRating":1.0,"numberOfUserReviews":1,"numberOfCopies":1,"releaseDate":"2010-07-13","copiesCurrentlyRented":1,"newRelease":"Test","movieID":1,"genre":"Test","mpaarating":"Test","director":"Test","supportingActor":"test","mainActor":"Test"}]


                index++;
            }
        }
        
      }
   };
   xhttp.send();
}

function transactionList(){
    var body = document.getElementById("transactionTable");
    body.innerHTML = "";
    var row = body.insertRow(0);
            var cell1 = row.insertCell(0);
            var cell2 = row.insertCell(1);
            cell1.innerHTML = "Transaction Id";
            cell2.innerHTML = "User Name";
   var xhttp = new XMLHttpRequest();
   var searchName = document.getElementById("search").value;
   var url = "http://localhost:8181/transaction/";
   if(searchName){
    url = url + searchName;
   }
   xhttp.open("GET", url, true);
   xhttp.setRequestHeader('Content-type', 'application/json');
   xhttp.onreadystatechange = function() {
      if (this.readyState == 4 && this.status == 200) {
   
         // Response
        var response = this.responseText; 
        var transactions = JSON.parse(response);
        var table = document.getElementById("transactionTable");
        var index = 1;

        if(response != null){
            for(var i = 0; i < transactions.length; i++){
                var obj = transactions[i];
                var row = table.insertRow(index);
                var cell1 = row.insertCell(0);
                var cell2 = row.insertCell(1);
                cell1.innerHTML = obj["transcationID"];
                cell2.innerHTML = obj["userName"];

                //[{"movieName":"Inception","expectedReturnDate":"2020-11-15","rentedOrPurchased":"R","returnDate":null,"userName":"daniel","balancePaid":"","transactionTotal":2.0,"transcationID":1,"orderDate":null,"checkOutDate":"2020-11-10"}]
                index++;
            }
        }
        
      }
   };
   xhttp.send();
}

function getBalanceList(){
    var body = document.getElementById("balanceTable");
    body.innerHTML = "";
    var row = body.insertRow(0);
            var cell1 = row.insertCell(0);
            var cell2 = row.insertCell(1);
            var cell3 = row.insertCell(2);
            cell1.innerHTML = "Record Id";
            cell2.innerHTML = "User Name";
            cell3.innterHTML = "Outstanding Fees";
   var xhttp = new XMLHttpRequest();
   var searchName = document.getElementById("search").value;
   var url = "http://localhost:8181/balance/" + searchName;
   xhttp.open("GET", url, true);
   xhttp.setRequestHeader('Content-type', 'application/json');
   xhttp.onreadystatechange = function() {
      if (this.readyState == 4 && this.status == 200) {
   
         // Response
        var response = this.responseText; 
        var transactions = JSON.parse(response);
        var table = document.getElementById("balanceTable");

        if(response != null){
                var obj = transactions;
                var row = table.insertRow(1);
                var cell1 = row.insertCell(0);
                var cell2 = row.insertCell(1);
                var cell3 = row.insertCell(2);
                cell1.innerHTML = obj["recordId"];
                cell2.innerHTML = obj["userName"];
                cell3.innerHTML = obj["outstandingFees"];
//{"userName":"daniel","outstandingFees":2.0,"storeCredit":0.0,"discount":"0","recordId":1}      
        }
        
      }
   };
   xhttp.send();
}

function reviewAlert() {
    alert ("Thank you! Your review has been submitted.");
  }

function submitReview(){
    var data = {};
    data.UserName = document.getElementById("userName").value;
    data.MovieName = document.getElementById("movieName").value;
    data.Review = document.getElementById("review").value;
    data.Rating =  document.getElementById("rating").value;
   var xhttp = new XMLHttpRequest();
   var url = "http://localhost:8181/review/";
   xhttp.open("POST", url, true);
   xhttp.setRequestHeader('Content-type', 'application/json');
   xhttp.send(JSON.stringify(data));
   xhttp.onreadystatechange = function() {
      if (this.readyState == 4 && this.status == 200) {
        alert(xhttp.responseText);
      }
   };
}

function checkOut(){
    var data = {};
    data.UserName = document.getElementById("userName").value;
    data.MovieName = document.getElementById("movieName").value;
    data.RentedOrPurchased = document.getElementById("rentpurchase").value;
   var xhttp = new XMLHttpRequest();
   var url = "http://localhost:8181/transaction/new/";
   xhttp.open("POST", url, true);
   xhttp.setRequestHeader('Content-type', 'application/json');
   xhttp.send(JSON.stringify(data));
   xhttp.onreadystatechange = function() {
      if (this.readyState == 4 && this.status == 200) {
        alert(xhttp.responseText);
      }
   };
}

function payBalance(){
    var body = document.getElementById("balanceTable");
    body.innerHTML = "";
    var row = body.insertRow(0);
            var cell1 = row.insertCell(0);
            var cell2 = row.insertCell(1);
            var cell3 = row.insertCell(2);
            cell1.innerHTML = "Record Id";
            cell2.innerHTML = "User Name";
            cell3 = "Outstanding Fees";
   var xhttp = new XMLHttpRequest();
   var searchName = document.getElementById("search").value;
   var url = "http://localhost:8181/transaction/paid/" + searchName;
   xhttp.open("PUT", url, true);
   xhttp.setRequestHeader('Content-type', 'application/json');
   xhttp.onreadystatechange = function() {
      if (this.readyState == 4 && this.status == 200) {
   
         // Response
        var response = this.responseText; 
        var transactions = JSON.parse(response);
        var table = document.getElementById("balanceTable");

        if(response != null){
                var obj = transactions;
                var row = table.insertRow(1);
                var cell1 = row.insertCell(0);
                var cell2 = row.insertCell(1);
                var cell3 = row.insertCell(2);
                cell1.innerHTML = obj["recordId"];
                cell2.innerHTML = obj["userName"];
                cell3.innerHTML = obj["outstandingFees"];
//{"userName":"daniel","outstandingFees":2.0,"storeCredit":0.0,"discount":"0","recordId":1}      
        }
        
      }
   };
   xhttp.send();
}


