<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>CONDICIONES  PARTICULARES DEL SERVICIO DE INTERNET</title>
 
</head>
<!--  onLoad="alert('Bienvenido a mi web');" onUnLoad="confirm('Gracias por tu visita, espero que vuelvas!);"-->
<body >
<script>
function myFunction() {
	window.print();
}
</script>

<form action="/SonetProyecto/EnvioFormulario" method="post" >


<h1 align="center">bySonetnet Cia. Ltda.</H1>
<hr>



*Los campos con un asterisco(*) son obligatorios. <br /><br />
*Ciudad: <input type="text" name="ciudadContrato" placeholder = "Ejm: Cuenca" required/>  
*Año: <input type="number" name="anioContrato" placeholder = "Ejm: 2015" size="7" required/>
*Mes: <input type="number" name="mesContrato" placeholder = "Ejm: 02" size="7" required/>
*Día: <input type="number" name="diaContrato" placeholder = "Ejm: 19" size="7" required/>

<hr>

<div style="background-color:#CEE3A8;" >

<h3 >INFORMACION ABONADO/SUPSCRIPTOR PERSONA NATURAL</h3>

<br />
</div>
Nombres: <input type="text" name="nombresPN" placeholder = "Ejm: Juan Carlos"/> <pre style='display:inline'>&#09;&#09;&#09;&#09;</pre>
Apellidos: <input type="text" name="apellidosPN" placeholder = "Ejm: Segarra Astudillo"/> <br /><br />

Cédula de identidad: <input type="text" name="cedulaPN" placeholder = "Ejm: 0123456987"/><br /><br />

Teléfono Fijo: <input type="text" name="telefonoPN" placeholder = "Ejm: 4156845"/><pre style='display:inline'>&#09;&#09;&#09;&#09;</pre>
Celular: <input type="text" name="celularPN" placeholder = "Ejm: 0987654321"/><pre style='display:inline'>&#09;&#09;&#09;&#09;&#09;&#09;</pre>
E-mail: <input type="email" name="emailPN" placeholder = "Ejm: juan@gmail.com"/> <br /><br />

Tercera Edad:<pre style='display:inline'>&#09;&#09;</pre><input type="radio" name="terceraEdad" value="SI"> SI <pre style='display:inline'> &#09;&#09;</pre><input type="radio" name="terceraEdad" value="NO">NO <pre style='display:inline'> &#09;&#09;</pre> 
Discapacidad: <pre style='display:inline'>&#09;&#09;</pre><input type="radio" name="discapacidad" value="SI"> SI <pre style='display:inline'> &#09;&#09;</pre><input type="radio" name="discapacidad" value="NO">NO  

<hr>



<h3>INFORMACION  ABONADO/SUSCRIPTOR  PERSONAL JURÍDICA</h3>

Nombre de la Empresa: <input type="text" name="empresaPJ" placeholder = "Ejm: Compania .ltda"/><br /><br />

Ruc: <input type="text" name="rucPJ" placeholder = "Ejm: 1234567894"/> <pre style='display:inline'>&#09;&#09;&#09;&#09;&#09;</pre>
Actividad Económica: <input type="text" name="actividadPJ" placeholder = "Ejm: Venta de inmuebles" size="30"/><br /><br />

Nombres Representante Legal: <input type="text" name="nombreRPJ" placeholder = "Ejm: Juan Carlos"/> <pre style='display:inline'>&#09;&#09;</pre>
Apellidos Representante Legal: <input type="text" name="apellidosRPJ" placeholder = "Ejm: Segarra Astudillo"/> <pre style='display:inline'>&#09;&#09;&#09;</pre>
C.I Representante Legal: <input type="text" name="cedulaRPJ" placeholder = "Ejm:0123456789"/><br /><br />

Dirección de Oficina Matriz: <input type="text" name="direccionPJ" placeholder = "Ejm: Av. Tejar y Cerezos 17-2" size="25"/> <pre style='display:inline'>&#09;&#09;</pre>
Ciudad: <input type="text" name="ciudadPJ" placeholder = "Ejm: Cuenca"/> <pre style='display:inline'>&#09;&#09;&#09;&#09;&#09;</pre>
Provincia: <input type="text" name="provinciaPJ" placeholder = "Ejm: Azuay"/> <br /><br />

Contacto Telefónico: <input type="text" name="telefonoPJ" placeholder = "Ejm: 4123568"/> <pre style='display:inline'>&#09;&#09;&#09;</pre>
Página Web: <input type="text" name="webPJ" placeholder = "Ejm: www.empresa.com"/> <br /><br />

Teléfono: <input type="text" name="telefonoRPJ" placeholder = "Ejm: 4123568" /> <pre style='display:inline'>&#09;&#09;&#09;&#09;</pre>
No. Celular: <input type="text" name="celularRPJ" placeholder = "Ejm: 0987654321"/> <pre style='display:inline'>&#09;&#09;&#09;&#09;&#09;</pre>
E-mail: <input type="email" name="emailRPJ" placeholder = "Ejm: Azuay"/><br /><br />
<hr>



<h3>DIRECCION DE INSTALACIÓN</h3>

Provincia: <input type="text" name="provinciaDir" placeholder = "Ejm: Azuay" /> <pre style='display:inline'>&#09;&#09;</pre>
Ciudad: <input type="text" name="ciudadDir" placeholder = "Ejm: Cuenca"/> <pre style='display:inline'>&#09;&#09;</pre>
Cantón:  <input type="text" name="cantonDir" placeholder = "Ejm: Cuenca"/> <pre style='display:inline'>&#09;</pre>
Parroquia: <input type="text" name="parroquiaDir" placeholder = "Ejm: San Sebastian"/> <br /><br />

Calle Principal: <input type="text" name="callePDir" placeholder = "Ejm: Padre Aguirre"/> <pre style='display:inline'>&#09;&#09;&#09;&#09;</pre>
Calle Secundaria: <input type="text" name="calleSDir" placeholder = "Ejm: Rafael Arizaga"/> <br /><br />

Urbanización: <input type="text" name="urbanizacionDir" placeholder = "Ejm: Los Hornos" /> <pre style='display:inline'>&#09;&#09;</pre>
Sector: <input type="text" name="sectorDir" placeholder = "Ejm: Las Praderas"/> <pre style='display:inline'>&#09;&#09;</pre>
Piso/Manzana:  <input type="text" name="pisoDir" placeholder = "Ejm: 4 piso"/> <pre style='display:inline'>&#09;&#09;</pre>
Dpto/Oficina: <input type="text" name="dptoDir" placeholder = "Ejm: 124"/><br /><br />


Observaciones: <input type="text" name="observacionesDir" size="100"/><br /><br />


Código de Medidor agua/luz:<input type="text" name="medidorDir" placeholder = "Ejm: ####" /> <pre style='display:inline'>&#09;&#09;&#09;&#09;</pre>
Anterior Proveedor:<input type="text" name="antDir" placeholder = "Ejm: Empresa"/> <pre style='display:inline'>&#09;&#09;</pre>
Caja: <pre style='display:inline'>&#09;</pre>
<input type="radio" name="cajaDir" value="D"> D <pre style='display:inline'>&#09;</pre>
<input type="radio" name="cajaDir" value="R"> R <pre style='display:inline'>&#09;</pre>
<input type="radio" name="cajaDir" value="N"> N 
<br /><br />

TIPO DE CUENTA: <pre style='display:inline'>&#09;</pre>
<input type="radio" name="cuentaDir" value="RESIDENCIAL"> RESIDENCIAL <pre style='display:inline'>&#09;</pre>
<input type="radio" name="cuentaDir" value="CIBERCAFE"> CIBERCAFE <pre style='display:inline'>&#09;</pre>
<input type="radio" name="cuentaDir" value="CORPORATIVO"> CORPORATIVO  <pre style='display:inline'>&#09;</pre>
<input type="radio" name="cuentaDir" value="OTROS"> OTROS 
<br /><br /><hr>



<h3>RED DE ACCESO</h3>

<input type="radio" name="desreD" value="PAR DE COBRE"> PAR DE COBRE <pre style='display:inline'>&#09;&#09;&#09;&#09;</pre>
<input type="radio" name="desreD" value="FIBRA OPTICA PUNTO A PUNTO"> FIBRA OPTICA PUNTO A PUNTO  <pre style='display:inline'>&#09;&#09;</pre>
<input type="radio" name="desreD" value="INALAMBRICO PUNTO MULTIPUNTO"> INALAMBRICO PUNTO MULTIPUNTO <br /><br />
<input type="radio" name="desreD" value="COAXIAL"> COAXIAL <pre style='display:inline'>&#09;&#09;&#09;&#09;&#09;</pre>
<input type="radio" name="desreD" value="FIBRA OPTICA GPON"> FIBRA OPTICA GPON  <pre style='display:inline'>&#09;&#09;&#09;</pre>
<input type="radio" name="desreD" value="INALAMBRICO PUNTO A PUNTO"> INALAMBRICO PUNTO A PUNTO  <br /><br />
<input type="radio" name="desreD" value="OTROS"> OTROS
<br /><br /><hr>




<h3>FORMA DE PAGO</h3>

<input type="radio" name="formaPago" value="DEBITO AUTOMATICO"> DÉBITO AUTOMÁTICO <pre style='display:inline'>&#09;&#09;&#09;</pre>
<input type="radio" name="formaPago" value="VENTANILLA"> VENTANILLA <pre style='display:inline'>&#09;&#09;&#09;&#09;</pre>
<input type="radio" name="formaPago" value="TARJETA DE CREDITO"> TARJETA DE CRÉDITO <br /><br />


Número de Cuenta: <input type="text" name="cuentaPago" placeholder = "Ejm: ####" /> <pre style='display:inline'>&#09;&#09;&#09;</pre>
Tipo de Cuenta: <input type="text" name="tipoCPago" placeholder = "Ejm: Ahorros"/> <pre style='display:inline'>&#09;&#09;&#09;&#09;&#09;</pre>
Entidad Financiera: <input type="text" name="entidadCPago" placeholder = "Ejm: Banco X"/><br /><br />


Número de Tarjeta: <input type="text" name="tarjetaPago" placeholder = "Ejm: ####" /> <pre style='display:inline'>&#09;&#09;&#09;</pre>
Fecha Expiración Tarjeta: <input type="text" name="fechaTPago" placeholder = "Ejm: 02/2021"/> <pre style='display:inline'>&#09;&#09;&#09;</pre>
Entidad Financiera: <input type="text" name="entidadTPago" placeholder = "Ejm: Banco X"/><br /><br /><hr>




<h3>SERVICIO SOLICITADO INTERNET</h3>

Nombre del Plan Contratado: <input type="text" name="nombrePlan" placeholder = "Ejm: Juan Carlos" size="30"/> <pre style='display:inline'>&#09;&#09;</pre>
Código del Plan Contratado: <input type="text" name="codigoPlan" placeholder = "Ejm: Segarra Astudillo"/> <br /><br />


VELOCIDAD (Kbps): COMERCIAL: BAJADA <input type="number" name="comercialDown" placeholder = "Ejm: 16" size="8"/>
SUBIDA <input type="number" name="comercialUp" placeholder = "Ejm: 16" size="8"/><pre style='display:inline'>&#09;</pre>
VELOCIDAD (Kbps): EFECTIVA: BAJADA <input type="number" name="efectivaDown" placeholder = "Ejm: 16" size="8"/>
SUBIDA <input type="number" name="efectivaUp" placeholder = "Ejm: 16" size="8"/> <br /><br />


NIVEL DE COMPARTICION:   <pre style='display:inline'>&#09;&#09;&#09;</pre>
<input type="radio" name="comparticion" value="1:1"> 1:1 <pre style='display:inline'>&#09;&#09;&#09;</pre>
<input type="radio" name="comparticion" value="2:1"> 2:1 <pre style='display:inline'>&#09;&#09;&#09;</pre>
<input type="radio" name="comparticion" value="4:1"> 4:1 <pre style='display:inline'>&#09;&#09;&#09;</pre>
<input type="radio" name="comparticion" value="8:4"> 8:4 <pre style='display:inline'>&#09;&#09;&#09;</pre><br /><br />

CONTRATO INCLUYE PERMANENCIA MINIMA: 
<input type="radio" name="permanencia" value="SI"> SI <pre style='display:inline'>&#09;</pre>
<input type="radio" name="permanencia" value="NO"> NO <pre style='display:inline'>&#09;</pre>
TIEMPO MINIMO DE CONTRATO :  <input type="text" name="tiempoContrato" placeholder = "Ejm: 1 año"/> <br/><br/>
BENEFICIOS POR  PERMANENCIA MINIMA:  <input type="text" name="beneficiosContrato" size="60"/>
<br /><br /><hr>




<h3>SERVICIO ADICIONALES QUE SE OFRECE</h3>

CORREO ELECTRONICO:  <pre style='display:inline'>&#09;</pre><input type="radio" name="correoadicional" value="SI"/>SI <pre style='display:inline'>&#09;</pre>
															<input type="radio" name="correoadicional" value="NO"/>NO <pre style='display:inline'>&#09;&#09;&#09;&#09;</pre>
															DESCRIPCION: <input type="text" name="obsCAdicional" size="50"/>	<br />	<br />	
															
															
OTROS SERVICIOS: <pre style='display:inline'>&#09;&#09;</pre><input type="radio" name="otrosadicional" value="SI"/>SI <pre style='display:inline'>&#09;</pre>
															<input type="radio" name="otrosadicional" value="NO"/>NO <pre style='display:inline'>&#09;&#09;&#09;&#09;</pre>
															DESCRIPCION: <input type="text" name="obsOAdicional" size="50"/>	<br />	<br /><hr />
																																							



<h3>TARIFAS (*)</h3>
<h3>TARIFAS  POR INSTALACION ( VALORES A PAGAR POR UNA SOLA VEZ)</h3>	
<p>Por favor, utilice punto(.) para decimales.</p>
<br /> 
VALOR DE LA INSTALACION: <input type="number" name="valorInstalacion" placeholder = "Ejm: 50.75" />USD<pre style='display:inline'>&#09;&#09;</pre>
PLAZO PARA LA INSTALAR/ACTIVAR EL SERVICIO (HORAS/DIAS): <input type="text" name="plazoInstalacion" /> 
<br /><br />
												



<h3>TARIFAS  POR EL SERVICIO  ( VALORES PAGO MENSUAL)</h3>	

VALOR MENSUAL DEL PLAN: <input type="number" name="planmensual" placeholder = "Ejm: 50.75" /> USD<br /><br />
 DETALLE  VALOR  OTROS SERVICIOS <pre style='display:inline'>&#09;&#09;&#09;&#09;&#09;&#09;</pre> ITEM <pre style='display:inline'>&#09;&#09;&#09;&#09;&#09;&#09;</pre> VALOR USD<br /><br />

1. <input type="text" name="detalleuno" size="40"/><pre style='display:inline'>&#09;&#09;&#09;&#09;</pre> <input type="text" name="itemuno" /><pre style='display:inline'>&#09;&#09;&#09;&#09;</pre> <input type="number" name="valoruno" placeholder="Ejm: 50.75" /> <br /> <br />
2. <input type="text" name="detalledos" size="40"/><pre style='display:inline'>&#09;&#09;&#09;&#09;</pre> <input type="text" name="itemdos" /><pre style='display:inline'>&#09;&#09;&#09;&#09;</pre> <input type="number" name="valordos" placeholder="Ejm: 50.75" />
<br /><br /> <hr/>
SITIO  WEB PARA CONSULTA DE TARIFAS  :         <a href="https://gonet.ec">WWW.GONET.EC/TARIFAS</a> <br /> <br />
SITIO  WEB PARA CONSULTA DE CALIDAD  :         <a href="https://gonet.ec/contacto/">WWW.GONET.EC/CALIDAD</a><br /> <br /> <hr />

<h3>COMPROBANTE DE PAGO DE LA PRIMERA CUOTA</h3>	

Banco: <input type="text" name="bancoComprobante" /> <pre style='display:inline'>&#09;&#09;&#09;&#09;&#09;&#09;</pre> 
Cheque #: <input type="text" name="chequeComprobante" /><pre style='display:inline'>&#09;&#09;&#09;&#09;</pre> 
Efectivo $: <input type="text" name="efectivoComprobante" placeholder="Ejm. 110.10" /><br /><br />

Número de Cuenta: <input type="text" name="cuentaComprobante" /> <pre style='display:inline'>&#09;&#09;&#09;&#09;</pre> 
Valor $: <input type="text" name="valorcComprobante" placeholder="Ejm. 110.10" /><br /><br />

Número de Tarjeta: <input type="text" name="tarjetaComprobante" /> <pre style='display:inline'>&#09;&#09;&#09;&#09;</pre> 
Valor $: <input type="text" name="valortComprobante" placeholder="Ejm. 110.10" /><pre style='display:inline'>&#09;&#09;&#09;&#09;&#09;</pre> 
Entidad Financiera: <input type="text" name="entidadfComprobante" /><br /><br />

<hr />

<div style="text-align: center;">
<button type="submit" value="Enviar" name="btn_formulario" id="btn_formulario" >Enviar Formulario</button>
</div>
</form>

</body>
</html>