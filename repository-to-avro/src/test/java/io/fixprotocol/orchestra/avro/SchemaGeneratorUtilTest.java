package io.fixprotocol.orchestra.avro;

class SchemaGeneratorUtilTest {

	private String lineSeparator = System.lineSeparator();
	private String expectedCtor = new StringBuffer()
			.append(lineSeparator)
			.append(SchemaGeneratorUtil.indent(1))
			.append("public Logon (quickfix.field.EncryptMethod encryptMethod, quickfix.field.HeartBtInt heartBtInt, quickfix.field.DefaultApplVerID defaultApplVerID) {")
			.append(lineSeparator)
			.append(SchemaGeneratorUtil.indent(2)).append("this();").append(lineSeparator)
			.append(SchemaGeneratorUtil.indent(2)).append("setField(encryptMethod);").append(lineSeparator)					
			.append(SchemaGeneratorUtil.indent(2)).append("setField(heartBtInt);").append(lineSeparator)
			.append(SchemaGeneratorUtil.indent(2)).append("setField(defaultApplVerID);").append(lineSeparator)
			.append(SchemaGeneratorUtil.indent(1)).append("}")
			.append(lineSeparator).toString();
	
	/*     
		public Logon (quickfix.field.EncryptMethod encryptMethod, quickfix.field.HeartBtInt heartBtInt, quickfix.field.DefaultApplVerID defaultApplVerID) {
			this();
		    setField(encryptMethod);
		    setField(heartBtInt);
		    setField(defaultApplVerID);
		}
	 */

}
