/**
 * ArvoreGenerica.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.jus.cnj.www.sgt.sgt_ws;

public class ArvoreGenerica  implements java.io.Serializable {
    private int seq_elemento;

    private java.lang.String dsc_elemento;

    private int seq_elemento_pai;

    private java.lang.String temFilhos;

    private java.lang.String situacao;

    private br.jus.cnj.www.sgt.sgt_ws.ArvoreGenerica[] filhos;

    public ArvoreGenerica() {
    }

    public ArvoreGenerica(
           int seq_elemento,
           java.lang.String dsc_elemento,
           int seq_elemento_pai,
           java.lang.String temFilhos,
           java.lang.String situacao,
           br.jus.cnj.www.sgt.sgt_ws.ArvoreGenerica[] filhos) {
           this.seq_elemento = seq_elemento;
           this.dsc_elemento = dsc_elemento;
           this.seq_elemento_pai = seq_elemento_pai;
           this.temFilhos = temFilhos;
           this.situacao = situacao;
           this.filhos = filhos;
    }


    /**
     * Gets the seq_elemento value for this ArvoreGenerica.
     * 
     * @return seq_elemento
     */
    public int getSeq_elemento() {
        return seq_elemento;
    }


    /**
     * Sets the seq_elemento value for this ArvoreGenerica.
     * 
     * @param seq_elemento
     */
    public void setSeq_elemento(int seq_elemento) {
        this.seq_elemento = seq_elemento;
    }


    /**
     * Gets the dsc_elemento value for this ArvoreGenerica.
     * 
     * @return dsc_elemento
     */
    public java.lang.String getDsc_elemento() {
        return dsc_elemento;
    }


    /**
     * Sets the dsc_elemento value for this ArvoreGenerica.
     * 
     * @param dsc_elemento
     */
    public void setDsc_elemento(java.lang.String dsc_elemento) {
        this.dsc_elemento = dsc_elemento;
    }


    /**
     * Gets the seq_elemento_pai value for this ArvoreGenerica.
     * 
     * @return seq_elemento_pai
     */
    public int getSeq_elemento_pai() {
        return seq_elemento_pai;
    }


    /**
     * Sets the seq_elemento_pai value for this ArvoreGenerica.
     * 
     * @param seq_elemento_pai
     */
    public void setSeq_elemento_pai(int seq_elemento_pai) {
        this.seq_elemento_pai = seq_elemento_pai;
    }


    /**
     * Gets the temFilhos value for this ArvoreGenerica.
     * 
     * @return temFilhos
     */
    public java.lang.String getTemFilhos() {
        return temFilhos;
    }


    /**
     * Sets the temFilhos value for this ArvoreGenerica.
     * 
     * @param temFilhos
     */
    public void setTemFilhos(java.lang.String temFilhos) {
        this.temFilhos = temFilhos;
    }


    /**
     * Gets the situacao value for this ArvoreGenerica.
     * 
     * @return situacao
     */
    public java.lang.String getSituacao() {
        return situacao;
    }


    /**
     * Sets the situacao value for this ArvoreGenerica.
     * 
     * @param situacao
     */
    public void setSituacao(java.lang.String situacao) {
        this.situacao = situacao;
    }


    /**
     * Gets the filhos value for this ArvoreGenerica.
     * 
     * @return filhos
     */
    public br.jus.cnj.www.sgt.sgt_ws.ArvoreGenerica[] getFilhos() {
        return filhos;
    }


    /**
     * Sets the filhos value for this ArvoreGenerica.
     * 
     * @param filhos
     */
    public void setFilhos(br.jus.cnj.www.sgt.sgt_ws.ArvoreGenerica[] filhos) {
        this.filhos = filhos;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArvoreGenerica)) return false;
        ArvoreGenerica other = (ArvoreGenerica) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.seq_elemento == other.getSeq_elemento() &&
            ((this.dsc_elemento==null && other.getDsc_elemento()==null) || 
             (this.dsc_elemento!=null &&
              this.dsc_elemento.equals(other.getDsc_elemento()))) &&
            this.seq_elemento_pai == other.getSeq_elemento_pai() &&
            ((this.temFilhos==null && other.getTemFilhos()==null) || 
             (this.temFilhos!=null &&
              this.temFilhos.equals(other.getTemFilhos()))) &&
            ((this.situacao==null && other.getSituacao()==null) || 
             (this.situacao!=null &&
              this.situacao.equals(other.getSituacao()))) &&
            ((this.filhos==null && other.getFilhos()==null) || 
             (this.filhos!=null &&
              java.util.Arrays.equals(this.filhos, other.getFilhos())));
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
        _hashCode += getSeq_elemento();
        if (getDsc_elemento() != null) {
            _hashCode += getDsc_elemento().hashCode();
        }
        _hashCode += getSeq_elemento_pai();
        if (getTemFilhos() != null) {
            _hashCode += getTemFilhos().hashCode();
        }
        if (getSituacao() != null) {
            _hashCode += getSituacao().hashCode();
        }
        if (getFilhos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFilhos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFilhos(), i);
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
        new org.apache.axis.description.TypeDesc(ArvoreGenerica.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.cnj.jus.br/sgt/sgt_ws.php", "ArvoreGenerica"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seq_elemento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seq_elemento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dsc_elemento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dsc_elemento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seq_elemento_pai");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seq_elemento_pai"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temFilhos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "temFilhos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("situacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "situacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filhos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filhos"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.cnj.jus.br/sgt/sgt_ws.php", "ArvoreGenerica"));
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
