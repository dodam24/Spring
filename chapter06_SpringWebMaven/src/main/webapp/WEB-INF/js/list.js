//list는 읽자마자 데이터를 불러와야 하므로 onload함수 이용
$(function(){
	$.ajax({
		type: 'post',
		url: '/chapter06_SpringWebMaven/user/getUserList',
		dataType: 'json',
		success: function(data){
			console.log(JSON.stringify(data));
			console.log(data[0].name);
			
			$.each(data, function(index, items){
				$('<tr/>').append($('<td/>', {
					align: 'center',
					text: items.name
				})).append($('<td/>', {
					align: 'center',
					text: items.id
				})).append($('<td/>', {
					align: 'center',
					text: items.pwd
				})).appendTo($('#userListTable'));
			}); //each
		},
		error: function(err){
			console.log(err);
		}
	});
});