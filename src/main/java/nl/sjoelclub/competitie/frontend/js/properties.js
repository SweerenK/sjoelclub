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