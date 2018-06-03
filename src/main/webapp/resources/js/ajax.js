$(function() {
	var $data=$('#datas');
	$.ajax({
		type:'GET',
		url:'https://pi4-v2-larav-pass-excel-api-gal05.c9users.io/api/reporte_v2',
		success:function(data){
			//console.log('success',data);
			$.each(data,function(i,item){
					$data.append('<li>item</li>');
			})
		},
		error:function(){
			alert('no funka la weaa');
		}
	});
});