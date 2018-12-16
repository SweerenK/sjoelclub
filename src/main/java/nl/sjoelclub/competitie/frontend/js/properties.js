function hover(){
   alert("hoi");
}

function load(x){
   var y = document.getElementById("content");
   switch(x.innerText){
      
      case "Menu":
         console.log("Menu");
         break;

      case "Inloggen":
         y.innerHTML = '<object type="text/html" data="inlog.html"></object>';
         console.log("Inloggen");
         break;

      case "Leden":
         y.innerHTML = '<object type="text/html" data="leden.html"></object>';
         console.log("Leden");
         break;

      case "Tussenstand":
         y.innerHTML = '<object type="text/html" data="tussenstand.html"></object>';
         console.log("Tussenstand");
         break;
   }

}