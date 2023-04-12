//회원정보 수정
$(function(){
	$('#updateDiv').hide(); //처음에는 수정창 숨기기
	
	//아이디 찾기
	$('#searchIdBtn').click(function(){
		$('#resultDiv').empty();
		
		$.ajax({
			type: 'post',
			url: '/chapter06_SpringWebMaven/user/getUser', //한 사람의 데이터를 가져옴
			data: 'id=' + $('#searchId').val(),
			//dataType: 'json' - dataType을 생략하면 스프링이 자동으로 해당 데이터 타입에 맞춰서 데이터를 받아들임 
			
			/*
			아이디가 있으면 UserDTO가 JSON으로 바뀌어서 들어오지만
			아이디가 없으면(=null) JSON으로 들어오지 못한다.
			그래서 현재 dataType을 생략한다. (dataType을 생략하면 자료형에 맞게 자동으로 형식이 저장된다.)
			*/
		
			success: function(data){
				console.log(JSON.stringify(data));
				
				if(data == ''){
					$('#updateDiv').hide();
				
					$('#resultDiv').text('찾고자 하는 아이디가 없습니다');
					$('#resultDiv').css('color', 'red').css('font-weight', 'bold');
				}else{
					$('#updateDiv').show();
				
					$('#name').val(data.name);
					$('#id').val(data.id);
					$('#pwd').val(data.pwd);
				}
			},
			error: function(err){
				console.log(err);
			}
		}); //ajax
	});
});


