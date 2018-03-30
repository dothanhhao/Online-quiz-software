<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Thi</title>
</head>
<body>

<div>
	<input type="hidden" id="h_val" value="0"/> <br/>
    <input type="hidden" id="m_val"  value="30"/> <br/>
    <input type="hidden" id="s_val" value="60"/>
    <div>
    	<p id="demo">${message}</p>
    	${aaa}
    	<button type="button" onclick="loadDoc()">Change Content</button>
    </div>
    <div>
            <span id="h">Giá»</span> :
            <span id="m">PhÃºt</span> :
            <span id="s">GiÃ¢y</span>
   </div>
	<form action="" method="post">
		<div>
			<label> how are you?</label><br>
			<input type="radio" name="key1" value="fine">fine<br>
			<input type="radio" name="key1" value="fine2">fine2<br>
			<input type="radio" name="key1" value="fine3">fine3<br>
			<input type="radio" name="key1" value="fine4">fine4<br>
			
			<label> what your name?</label><br>
			<input type="radio" name="key2" value="Truong">Truong<br>
			<input type="radio" name="key2" value="Hao">Hao<br>
			<input type="radio" name="key2" value="Dat">Dat<br>
			<input type="radio" name="key2" value="Phong">Phong<br>
			
			<label> Wasdadasdasdas?</label><br>
			<input type="checkbox" name="check" value="Truong">Truong<br>
			<input type="checkbox" name="check" value="Hao">Hao<br>
			<input type="checkbox" name="check" value="Dat">Dat<br>
			<input type="checkbox" name="check" value="Phong">Phong<br>
			
			
			<input type="submit" name="action">
		</div>
	</form>
</div>
	<script>


var h = null; // Giá»
var m = null; // PhÃºt
var s = null; // GiÃ¢y

var timeout = null; // Timeout
start();
function start()
{
	

    /*BÆ¯á»C 1: Láº¤Y GIÃ TRá» BAN Äáº¦U*/
    if (h === null)
    {
        h = parseInt(document.getElementById('h_val').value);
        m = parseInt(document.getElementById('m_val').value);
        s = parseInt(document.getElementById('s_val').value);
    }

    /*BÆ¯á»C 1: CHUYá»N Äá»I Dá»® LIá»U*/
    // Náº¿u sá» giÃ¢y = -1 tá»©c lÃ  ÄÃ£ cháº¡y ngÆ°á»£c háº¿t sá» giÃ¢y, lÃºc nÃ y:
    //  - giáº£m sá» phÃºt xuá»ng 1 ÄÆ¡n vá»
    //  - thiáº¿t láº­p sá» giÃ¢y láº¡i 59
    if (s === -1){
        m -= 1;
        s = 59;
    }

    // Náº¿u sá» phÃºt = -1 tá»©c lÃ  ÄÃ£ cháº¡y ngÆ°á»£c háº¿t sá» phÃºt, lÃºc nÃ y:
    //  - giáº£m sá» giá» xuá»ng 1 ÄÆ¡n vá»
    //  - thiáº¿t láº­p sá» phÃºt láº¡i 59
    if (m === -1){
        h -= 1;
        m = 59;
    }

    // Náº¿u sá» giá» = -1 tá»©c lÃ  ÄÃ£ háº¿t giá», lÃºc nÃ y:
    //  - Dá»«ng chÆ°Æ¡ng trÃ¬nh
    if (h == -1){
        clearTimeout(timeout);
        alert('Háº¿t giá»');
        return false;
    }

    /*BÆ¯á»C 1: HIá»N THá» Äá»NG Há»*/
    document.getElementById('h').innerText = h.toString();
    document.getElementById('m').innerText = m.toString();
    document.getElementById('s').innerText = s.toString();

    /*BÆ¯á»C 1: GIáº¢M PHÃT XUá»NG 1 GIÃY VÃ Gá»I Láº I SAU 1 GIÃY */
    timeout = setTimeout(function(){
        s--;
        start();
    }, 1000);
}
</script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-2.1.4.min.js"></script>
<script>
function loadDoc() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
      document.getElementById("demo").innerHTML = this.responseText;
    }
  };
  xhttp.open("GET", "ajax_info.txt", true);
  xhttp.send();
}




</script>
</body>
</html>