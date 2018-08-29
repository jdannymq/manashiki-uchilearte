var solicitudCertificadoApp = angular.module('solicitudCertificadoExito',[]);



solicitudCertificadoApp.controller('SolicitudCertificadoExitoController', [ '$scope', '$http', '$window', '$sce',
                                                        function($scope, $http, $window, $sce) {
	

	/*variables globales*/
	$scope.val = null;

	
	$scope.leerSolicitudCertificadoExito = function() {
				
		console.log('=============================================== Inicializando Data Certificados ===========================================');
		$scope.obtenerComponentesFormulario()
		console.log('=================================================================================================================');
	};
	
	$scope.obtenerComponentesFormulario = function(){
		console.log('============================================ Obtener Componentes Formulario ========================================');
		$scope.botonSalir = $('button[id=salir]');
		console.log('=================================================================================================================');
	};

	$scope.cerrarVentana = function(){
		console.log('============================================ Obtener Componentes Formulario ========================================');
		
		var url = $window.origin +'/uchile-facultad-de-arte-new/solicitud/'
		$window.location.href = url;
		
		console.log('=================================================================================================================');
	};
	
	
	
}]);