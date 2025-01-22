package br.com.alura.screenmacht.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
