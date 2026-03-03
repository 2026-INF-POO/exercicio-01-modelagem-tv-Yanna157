class TV {
  int tamanho;
  int voltagem;
  int canal;
  int volume = 5;

 int aumentarVolume(){
     if(volume < 10){
       volume++;
  }
   return volume;
 }

  int diminuirVolume(){
     if(volume > 10){
       volume--;
  }
   return volume;
 }

  void desligar(){
    //lógica para TV desligar
  }

  void subir_de_canal(){
    //lógica para TV trocar de canal (subindo)
  }

  void descer_de_canal(){
    //lógica para TV trocar de canal (descendo)
  }



 
  

}
