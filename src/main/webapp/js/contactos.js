$(function (){
	$(document).ready(function(){
		//Agregar funcionalidad al boton de agregar contacto
		
		buscar("buscar",1,8,1,"");
		
		$('body').on("click","#btnAgregar",function(e){
			e.preventDefault();
			$('#modalUserInfo').modal('toggle');
			consol.log("clic en guardar");
			
		})
	})
	
})

function buscar(accion, idUsuario, limite, pagina, busqueda){
	var datos=[
				{name:"accion", value: accion},
				{name:"idUsuario", value: idUsuario},
				{name:"limite", value: limite},
				{name:"pagina", value: pagina},
				{name:"busqueda", value: busqueda}
			  ]
	
	$.ajax({
		url:"ContactosController",
		type:"GET",
		data: datos,
		dataType:"json"
	}).done(function(respuesta){
		console.log(respuesta);
	}).fail(function(error){
		console.log("ERROR: "+error)
	})
}