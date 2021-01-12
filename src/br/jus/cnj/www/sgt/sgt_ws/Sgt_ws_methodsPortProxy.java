package br.jus.cnj.www.sgt.sgt_ws;

public class Sgt_ws_methodsPortProxy implements br.jus.cnj.www.sgt.sgt_ws.Sgt_ws_methodsPort {
  private String _endpoint = null;
  private br.jus.cnj.www.sgt.sgt_ws.Sgt_ws_methodsPort sgt_ws_methodsPort = null;
  
  public Sgt_ws_methodsPortProxy() {
    _initSgt_ws_methodsPortProxy();
  }
  
  public Sgt_ws_methodsPortProxy(String endpoint) {
    _endpoint = endpoint;
    _initSgt_ws_methodsPortProxy();
  }
  
  private void _initSgt_ws_methodsPortProxy() {
    try {
      sgt_ws_methodsPort = (new br.jus.cnj.www.sgt.sgt_ws.Sgt_ws_methodsServiceLocator()).getsgt_ws_methodsPort();
      if (sgt_ws_methodsPort != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sgt_ws_methodsPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sgt_ws_methodsPort)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sgt_ws_methodsPort != null)
      ((javax.xml.rpc.Stub)sgt_ws_methodsPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.jus.cnj.www.sgt.sgt_ws.Sgt_ws_methodsPort getSgt_ws_methodsPort() {
    if (sgt_ws_methodsPort == null)
      _initSgt_ws_methodsPortProxy();
    return sgt_ws_methodsPort;
  }
  
  public void inserirArquivoBanco(java.lang.Object publico) throws java.rmi.RemoteException{
    if (sgt_ws_methodsPort == null)
      _initSgt_ws_methodsPortProxy();
    sgt_ws_methodsPort.inserirArquivoBanco(publico);
  }
  
  public br.jus.cnj.www.sgt.sgt_ws.Item[] pesquisarItemPublicoWS(java.lang.String tipoTabela, java.lang.String tipoPesquisa, java.lang.String valorPesquisa) throws java.rmi.RemoteException{
    if (sgt_ws_methodsPort == null)
      _initSgt_ws_methodsPortProxy();
    return sgt_ws_methodsPort.pesquisarItemPublicoWS(tipoTabela, tipoPesquisa, valorPesquisa);
  }
  
  public java.lang.Object[] getArrayDetalhesItemPublicoWS(java.lang.String seqItem, java.lang.String tipoItem) throws java.rmi.RemoteException{
    if (sgt_ws_methodsPort == null)
      _initSgt_ws_methodsPortProxy();
    return sgt_ws_methodsPort.getArrayDetalhesItemPublicoWS(seqItem, tipoItem);
  }
  
  public br.jus.cnj.www.sgt.sgt_ws.ArvoreGenerica[] getArrayFilhosItemPublicoWS(int seqItem, java.lang.String tipoItem) throws java.rmi.RemoteException{
    if (sgt_ws_methodsPort == null)
      _initSgt_ws_methodsPortProxy();
    return sgt_ws_methodsPort.getArrayFilhosItemPublicoWS(seqItem, tipoItem);
  }
  
  public java.lang.String getStringPaisItemPublicoWS(int seqItem, java.lang.String tipoItem) throws java.rmi.RemoteException{
    if (sgt_ws_methodsPort == null)
      _initSgt_ws_methodsPortProxy();
    return sgt_ws_methodsPort.getStringPaisItemPublicoWS(seqItem, tipoItem);
  }
  
  public br.jus.cnj.www.sgt.sgt_ws.ComplementoMovimento[] getComplementoMovimentoWS(int codMovimento) throws java.rmi.RemoteException{
    if (sgt_ws_methodsPort == null)
      _initSgt_ws_methodsPortProxy();
    return sgt_ws_methodsPort.getComplementoMovimentoWS(codMovimento);
  }
  
  public java.lang.String getDataUltimaVersao() throws java.rmi.RemoteException{
    if (sgt_ws_methodsPort == null)
      _initSgt_ws_methodsPortProxy();
    return sgt_ws_methodsPort.getDataUltimaVersao();
  }
  
  
}