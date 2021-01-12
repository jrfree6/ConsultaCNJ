/**
 * Sgt_ws_methodsPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.jus.cnj.www.sgt.sgt_ws;

public interface Sgt_ws_methodsPort extends java.rmi.Remote {

    /**
     * inserirArquivoBanco
     */
    public void inserirArquivoBanco(java.lang.Object publico) throws java.rmi.RemoteException;
    public br.jus.cnj.www.sgt.sgt_ws.Item[] pesquisarItemPublicoWS(java.lang.String tipoTabela, java.lang.String tipoPesquisa, java.lang.String valorPesquisa) throws java.rmi.RemoteException;

    /**
     * Retorna uma array do objeto preenchido de acordo com o item
     * requisitado
     */
    public java.lang.Object[] getArrayDetalhesItemPublicoWS(java.lang.String seqItem, java.lang.String tipoItem) throws java.rmi.RemoteException;
    public br.jus.cnj.www.sgt.sgt_ws.ArvoreGenerica[] getArrayFilhosItemPublicoWS(int seqItem, java.lang.String tipoItem) throws java.rmi.RemoteException;

    /**
     * Retorna uma string contendo o encadeamento de pais de um item
     */
    public java.lang.String getStringPaisItemPublicoWS(int seqItem, java.lang.String tipoItem) throws java.rmi.RemoteException;

    /**
     * Retorna uma string contendo o encadeamento de pais de um item
     */
    public br.jus.cnj.www.sgt.sgt_ws.ComplementoMovimento[] getComplementoMovimentoWS(int codMovimento) throws java.rmi.RemoteException;

    /**
     * Retorna uma string contendo o encadeamento de pais de um item
     */
    public java.lang.String getDataUltimaVersao() throws java.rmi.RemoteException;
}
