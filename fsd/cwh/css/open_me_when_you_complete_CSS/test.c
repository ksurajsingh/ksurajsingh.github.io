#include<stdio.h>
#include<stdlib.h>

void main(){
  char command[300];
  char dir[50]="/mnt/KSS/Media/songs/";
  char songs_name[200]="Accha_Ji_Mein_Haari_Chalo_Maan_Jao_Na_｜_Slowed+Reverb_Lofi_song_｜_Mohammed_Rafi_and_Asha_Bhosle-jZABfJWZIOs.mp3";
  snprintf(command,sizeof(command), "mpv \"%s%s\"",dir,songs_name);
  system(command);
}
