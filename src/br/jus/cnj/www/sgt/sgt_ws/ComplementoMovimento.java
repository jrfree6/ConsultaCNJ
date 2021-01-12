/**
 * ComplementoMovimento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.jus.cnj.www.sgt.sgt_ws;

public class ComplementoMovimento  implements java.io.Serializable {
    private java.lang.Integer seqComplemento;

    private java.lang.Integer seqTipoComplemento;

    private java.lang.Integer seqComplMov;

    private java.lang.String dscComplemento;

    private java.lang.String dscObservacao;

    private java.lang.Object[] arrayValoresTabelados;

    private java.lang.Object[] arrayMovimentosVinculados;

    public ComplementoMovimento() {
    }

    public ComplementoMovimento(
           java.lang.Integer seqComplemento,
           java.lang.Integer seqTipoComplemento,
           java.lang.Integer seqComplMov,
           java.lang.String dscComplemento,
           java.lang.String dscObservacao,
           java.lang.Object[] arrayValoresTabelados,
           java.lang.Object[] arrayMovimentosVinculados) {
           this.seqComplemento = seqComplemento;
           this.seqTipoComplemento = seqTipoComplemento;
           this.seqComplMov = seqComplMov;
           this.dscComplemento = dscComplemento;
           this.dscObservacao = dscObservacao;
           this.arrayValoresTabelados = arrayValoresTabelados;
           this.arrayMovimentosVinculados = arrayMovimentosVinculados;
    }


    /**
     * Gets the seqComplemento value for this ComplementoMovimento.
     * 
     * @return seqComplemento
     */
    public java.lang.Integer getSeqComplemento() {
        return seqComplemento;
    }


    /**
     * Sets the seqComplemento value for this ComplementoMovimento.
     * 
     * @param seqComplemento
     */
    public void setSeqComplemento(java.lang.Integer seqComplemento) {
        this.seqComplemento = seqComplemento;
    }


    /**
     * Gets the seqTipoComplemento value for this ComplementoMovimento.
     * 
     * @return seqTipoComplemento
     */
    public java.lang.Integer getSeqTipoComplemento() {
        return seqTipoComplemento;
    }


    /**
     * Sets the seqTipoComplemento value for this ComplementoMovimento.
     * 
     * @param seqTipoComplemento
     */
    public void setSeqTipoComplemento(java.lang.Integer seqTipoComplemento) {
        this.seqTipoComplemento = seqTipoComplemento;
    }


    /**
     * Gets the seqComplMov value for this ComplementoMovimento.
     * 
     * @return seqComplMov
     */
    public java.lang.Integer getSeqComplMov() {
        return seqComplMov;
    }


    /**
     * Sets the seqComplMov value for this ComplementoMovimento.
     * 
     * @param seqComplMov
     */
    public void setSeqComplMov(java.lang.Integer seqComplMov) {
        this.seqComplMov = seqComplMov;
    }


    /**
     * Gets the dscComplemento value for this ComplementoMovimento.
     * 
     * @return dscComplemento
     */
    public java.lang.String getDscComplemento() {
        return dscComplemento;
    }


    /**
     * Sets the dscComplemento value for this ComplementoMovimento.
     * 
     * @param dscComplemento
     */
    public void setDscComplemento(java.lang.String dscComplemento) {
        this.dscComplemento = dscComplemento;
    }


    /**
     * Gets the dscObservacao value for this ComplementoMovimento.
     * 
     * @return dscObservacao
     */
    public java.lang.String getDscObservacao() {
        return dscObservacao;
    }


    /**
     * Sets the dscObservacao value for this ComplementoMovimento.
     * 
     * @param dscObservacao
     */
    public void setDscObservacao(java.lang.String dscObservacao) {
        this.dscObservacao = dscObservacao;
    }


    /**
     * Gets the arrayValoresTabelados value for this ComplementoMovimento.
     * 
     * @return arrayValoresTabelados
     */
    public java.lang.Object[] getArrayValoresTabelados() {
        return arrayValoresTabelados;
    }


    /**
     * Sets the arrayValoresTabelados value for this ComplementoMovimento.
     * 
     * @param arrayValoresTabelados
     */
    public void setArrayValoresTabelados(java.lang.Object[] arrayValoresTabelados) {
        this.arrayValoresTabelados = arrayValoresTabelados;
    }


    /**
     * Gets the arrayMovimentosVinculados value for this ComplementoMovimento.
     * 
     * @return arrayMovimentosVinculados
     */
    public java.lang.Object[] getArrayMovimentosVinculados() {
        return arrayMovimentosVinculados;
    }


    /**
     * Sets the arrayMovimentosVinculados value for this ComplementoMovimento.
     * 
     * @param arrayMovimentosVinculados
     */
    public void setArrayMovimentosVinculados(java.lang.Object[] arrayMovimentosVinculados) {
        this.arrayMovimentosVinculados = arrayMovimentosVinculados;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComplementoMovimento)) return false;
        ComplementoMovimento other = (ComplementoMovimento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqComplemento==null && other.getSeqComplemento()==null) || 
             (this.seqComplemento!=null &&
              this.seqComplemento.equals(other.getSeqComplemento()))) &&
            ((this.seqTipoComplemento==null && other.getSeqTipoComplemento()==null) || 
             (this.seqTipoComplemento!=null &&
              this.seqTipoComplemento.equals(other.getSeqTipoComplemento()))) &&
            ((this.seqComplMov==null && other.getSeqComplMov()==null) || 
             (this.seqComplMov!=null &&
              this.seqComplMov.equals(other.getSeqComplMov()))) &&
            ((this.dscComplemento==null && other.getDscComplemento()==null) || 
             (this.dscComplemento!=null &&
              this.dscComplemento.equals(other.getDscComplemento()))) &&
            ((this.dscObservacao==null && other.getDscObservacao()==null) || 
             (this.dscObservacao!=null &&
              this.dscObservacao.equals(other.getDscObservacao()))) &&
            ((this.arrayValoresTabelados==null && other.getArrayValoresTabelados()==null) || 
             (this.arrayValoresTabelados!=null &&
              java.util.Arrays.equals(this.arrayValoresTabelados, other.getArrayValoresTabelados()))) &&
            ((this.arrayMovimentosVinculados==null && other.getArrayMovimentosVinculados()==null) || 
             (this.arrayMovimentosVinculados!=null &&
              java.util.Arrays.equals(this.arrayMovimentosVinculados, other.getArrayMovimentosVinculados())));
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
        if (getSeqComplemento() != null) {
            _hashCode += getSeqComplemento().hashCode();
        }
        if (getSeqTipoComplemento() != null) {
            _hashCode += getSeqTipoComplemento().hashCode();
        }
        if (getSeqComplMov() != null) {
            _hashCode += getSeqComplMov().hashCode();
        }
        if (getDscComplemento() != null) {
            _hashCode += getDscComplemento().hashCode();
        }
        if (getDscObservacao() != null) {
            _hashCode += getDscObservacao().hashCode();
        }
        if (getArrayValoresTabelados() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArrayValoresTabelados());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArrayValoresTabelados(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getArrayMovimentosVinculados() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArrayMovimentosVinculados());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArrayMovimentosVinculados(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComplementoMovimento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.cnj.jus.br/sgt/sgt_ws.php", "ComplementoMovimento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqComplemento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seqComplemento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqTipoComplemento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seqTipoComplemento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqComplMov");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seqComplMov"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dscComplemento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dscComplemento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dscObservacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dscObservacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrayValoresTabelados");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arrayValoresTabelados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "Array"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrayMovimentosVinculados");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arrayMovimentosVinculados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "Array"));
        elemField.setNillable(true);
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
