function validar() {
    valor = document.getElementById("cui").value;
    if( valor == null || valor.length == 0 || /^\s+$/.test(valor) ) {
      alert("Debes llenar el campo CUI");
      return false;
    }
    else if(!/^[0-9]{0,9}$/.test(valor)) {
      alert("CUI no valido");
      return false;
    }
    
    valor = document.getElementById("clave").value;
    if( valor == null || valor.length == 0 || /^\s+$/.test(valor) ) {
      alert("Debes llenar el campo Clave");
      return false;
    }    

    alert("Loggin ... ")
    return true;
	}