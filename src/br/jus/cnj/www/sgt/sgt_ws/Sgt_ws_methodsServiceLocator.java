/**
 * Sgt_ws_methodsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.jus.cnj.www.sgt.sgt_ws;

public class Sgt_ws_methodsServiceLocator extends org.apache.axis.client.Service implements br.jus.cnj.www.sgt.sgt_ws.Sgt_ws_methodsService {

    public Sgt_ws_methodsServiceLocator() {
    }


    public Sgt_ws_methodsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Sgt_ws_methodsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for sgt_ws_methodsPort
    private java.lang.String sgt_ws_methodsPort_address = "https://www.cnj.jus.br/sgt/sgt_ws.php";

    public java.lang.String getsgt_ws_methodsPortAddress() {
        return sgt_ws_methodsPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String sgt_ws_methodsPortWSDDServiceName = "sgt_ws_methodsPort";

    public java.lang.String getsgt_ws_methodsPortWSDDServiceName() {
        return sgt_ws_methodsPortWSDDServiceName;
    }

    public void setsgt_ws_methodsPortWSDDServiceName(java.lang.String name) {
        sgt_ws_methodsPortWSDDServiceName = name;
    }

    public br.jus.cnj.www.sgt.sgt_ws.Sgt_ws_methodsPort getsgt_ws_methodsPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(sgt_ws_methodsPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getsgt_ws_methodsPort(endpoint);
    }

    public br.jus.cnj.www.sgt.sgt_ws.Sgt_ws_methodsPort getsgt_ws_methodsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.jus.cnj.www.sgt.sgt_ws.Sgt_ws_methodsBindingStub _stub = new br.jus.cnj.www.sgt.sgt_ws.Sgt_ws_methodsBindingStub(portAddress, this);
            _stub.setPortName(getsgt_ws_methodsPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setsgt_ws_methodsPortEndpointAddress(java.lang.String address) {
        sgt_ws_methodsPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.jus.cnj.www.sgt.sgt_ws.Sgt_ws_methodsPort.class.isAssignableFrom(serviceEndpointInterface)) {
                br.jus.cnj.www.sgt.sgt_ws.Sgt_ws_methodsBindingStub _stub = new br.jus.cnj.www.sgt.sgt_ws.Sgt_ws_methodsBindingStub(new java.net.URL(sgt_ws_methodsPort_address), this);
                _stub.setPortName(getsgt_ws_methodsPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("sgt_ws_methodsPort".equals(inputPortName)) {
            return getsgt_ws_methodsPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://www.cnj.jus.br/sgt/sgt_ws.php", "sgt_ws_methodsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://www.cnj.jus.br/sgt/sgt_ws.php", "sgt_ws_methodsPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("sgt_ws_methodsPort".equals(portName)) {
            setsgt_ws_methodsPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
