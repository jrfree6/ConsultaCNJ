/**
 * Item.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.jus.cnj.www.sgt.sgt_ws;

public class Item  implements java.io.Serializable {
    private int cod_item;

    private int cod_item_pai;

    private java.lang.String nome;

    private java.lang.String dscGlossario;

    public Item() {
    }

    public Item(
           int cod_item,
           int cod_item_pai,
           java.lang.String nome,
           java.lang.String dscGlossario) {
           this.cod_item = cod_item;
           this.cod_item_pai = cod_item_pai;
           this.nome = nome;
           this.dscGlossario = dscGlossario;
    }


    /**
     * Gets the cod_item value for this Item.
     * 
     * @return cod_item
     */
    public int getCod_item() {
        return cod_item;
    }


    /**
     * Sets the cod_item value for this Item.
     * 
     * @param cod_item
     */
    public void setCod_item(int cod_item) {
        this.cod_item = cod_item;
    }


    /**
     * Gets the cod_item_pai value for this Item.
     * 
     * @return cod_item_pai
     */
    public int getCod_item_pai() {
        return cod_item_pai;
    }


    /**
     * Sets the cod_item_pai value for this Item.
     * 
     * @param cod_item_pai
     */
    public void setCod_item_pai(int cod_item_pai) {
        this.cod_item_pai = cod_item_pai;
    }


    /**
     * Gets the nome value for this Item.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this Item.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the dscGlossario value for this Item.
     * 
     * @return dscGlossario
     */
    public java.lang.String getDscGlossario() {
        return dscGlossario;
    }


    /**
     * Sets the dscGlossario value for this Item.
     * 
     * @param dscGlossario
     */
    public void setDscGlossario(java.lang.String dscGlossario) {
        this.dscGlossario = dscGlossario;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Item)) return false;
        Item other = (Item) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.cod_item == other.getCod_item() &&
            this.cod_item_pai == other.getCod_item_pai() &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.dscGlossario==null && other.getDscGlossario()==null) || 
             (this.dscGlossario!=null &&
              this.dscGlossario.equals(other.getDscGlossario())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getCod_item();
        _hashCode += getCod_item_pai();
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getDscGlossario() != null) {
            _hashCode += getDscGlossario().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Item.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.cnj.jus.br/sgt/sgt_ws.php", "Item"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cod_item");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cod_item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cod_item_pai");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cod_item_pai"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dscGlossario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dscGlossario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
