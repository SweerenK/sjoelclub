function hover(){
   alert("hoi");
}

function load(x){
   var y = document.getElementById("content");
   switch(x.innerText){
      
      case "Menu":
         break;

      case "Inloggen":
         y.innerHTML = '<object id="contentobject" type="text/html" data="inlog.html" width=400 height=400></object>';
         break;

      case "Leden":
         y.innerHTML = '<object id="contentobject" type="text/html" data="leden.html" width=400 height=400"></object>';
         break;

      case "Scores":
         y.innerHTML = '<object id="contentobject" type="text/html" data="scores.html" width=400 height=400></object>';
         break;

      case "Tussenstand":
         y.innerHTML = '<object id="contentobject" type="text/html" data="tussenstand.html" width=400 height=400></object>';
         break;
   }
}

function db_findAllLeden(){
   var y = document.getElementById("ledenoverzicht");
   
   let xhr = new XMLHttpRequest();
   xhr.open("GET","http://localhost:8082/api/speler",true);

   xhr.onreadystatechange = function(){
      if(this.readyState == 4){
         var alleLeden = JSON.parse(this.responseText);
         
         for(var i = 0; i < alleLeden.length; i++){
            y.innerHTML += alleLeden[i].name + '<br />';
         }     
      }
   }
   xhr.send();

}
