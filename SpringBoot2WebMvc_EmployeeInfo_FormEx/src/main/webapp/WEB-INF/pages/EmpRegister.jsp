<html>
<body>
	<h1 style="color:blue;text-align:center">Welcome to Registration Page!</h1>
	<form action="save" method="Post">
	<table align="center" bgcolor="cyan">
	  <tr>
	    <td>Employee Id</td>
	    <td><input type="text" name="empId"/></td>
	  </tr>
	  <tr>
	    <td>Name</td>
	    <td><input type="text" name="empName"/></td>
	  </tr>
	  <tr>
	    <td>Salary</td>
	    <td><input type="text" name="empSal"/></td>
	  </tr>
	  <tr>
	    <td>Gender</td>
	    <td> <input type="radio" name="empGen" value="Male"/>Male
	         <input type="radio" name="empGen" value="Female"/>Female
	    </td>
	  </tr>
	  <tr>
	    <td>Password</td>
	    <td><input type="text" name="empPwd"/></td>
	  </tr>
	   <tr>
	    <td>Address</td>
	    <td><textarea name="empAddr"> </textarea></td>
	  </tr>
	  <tr>
	    <td>Department</td>
	    <td><select name="empDept"/>
	    		<option value="">---select---</option>
	    		<option value="DEV">DEV</option>
	    		<option value="QA">QA</option>
	    		<option value="BA">BA</option>
	    		<option value="TESTING">TESTING</option>
	    </td>
	  </tr>
	  <tr>
	    <td>Projects</td>
	    <td>
	    	<input type="checkbox" name="empProj" value="HTC"/>HTC
	    	<input type="checkbox" name="empProj" value="Oracle"/>Oracle
	    	<input type="checkbox" name="empProj" value="Infosys"/>Infosys
	    	<input type="checkbox" name="empProj" value="Amazon"/>Amazon
	    	<input type="checkbox" name="empProj" value="CTS"/>CTS
	    </td>
	  </tr>
	  <tr>
	    <td>Clients</td>
	    <td><select name="empClients" multiple/>
	    		<option value="Hyd">Hydrabad</option>
	    		<option value="Mum">Mumbai</option>
	    		<option value="Pune">Pune</option>
	    		<option value="Bng">Banglor</option>
	    		<option value="Uk">United Kingdom</option>
	    		<option value="Usa">USA</option>
	    		
	    </td>
	  </tr><br>
	  <tr>
	    <td><input type="submit" value="Register"/></td>
	    <td><input type="reset" value="Cancel"/></td>
	</table?
  </form>
</body>
</htlml>