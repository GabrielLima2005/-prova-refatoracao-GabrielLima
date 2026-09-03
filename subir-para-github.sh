#!/bin/bash
# ===============================================================
# Script pronto para subir a Prova Pratica de Refatoracao no GitHub
#
# ANTES DE RODAR:
# 1. Crie o repositorio vazio e PUBLICO no GitHub (github.com -> New repository)
# 2. Troque a URL abaixo pela URL do SEU repositorio
# 3. Coloque o arquivo diagrama-veiculo-refatorado.png (exportado do Astah)
#    dentro desta mesma pasta (prova-refatoracao/), na raiz.
#
# COMO RODAR (no terminal, dentro desta pasta):
#   bash subir-para-github.sh
# ===============================================================

set -e

REPO_URL="https://github.com/GabrielLima2005/-prova-refatoracao-GabrielLima"

echo "Verificando se o diagrama PNG esta presente..."
if [ ! -f "diagrama-veiculo-refatorado.png" ]; then
  echo "ATENCAO: diagrama-veiculo-refatorado.png nao encontrado nesta pasta."
  echo "Exporte o PNG do Astah e coloque aqui antes de continuar."
  exit 1
fi

echo "Inicializando repositorio git..."
git init
git remote add origin "$REPO_URL"

echo "Adicionando arquivos..."
git add .

echo "Criando commit..."
git commit -m "feat: implementa refatoracao da classe Veiculo"

echo "Enviando para o GitHub..."
git branch -M main
git push -u origin main

echo "Pronto! Confira em: $REPO_URL"
