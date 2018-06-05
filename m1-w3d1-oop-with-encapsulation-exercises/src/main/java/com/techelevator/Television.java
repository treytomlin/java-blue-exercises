package com.techelevator;

public class Television {
	
	private boolean isOn = false;
	private int currentChannel = 3;
	private int currentVolume = 2; 
	
	
	
	
	public boolean isOn() {
		return isOn;
	}

	public int getCurrentChannel() {
		return currentChannel;
	}

	public int getCurrentVolume() {
		return currentVolume;
	}

	
	
	public void turnOff() { // turns off the tv
	if(isOn) {
		this.isOn = false;
	}
	this.isOn = false;
	}
	
	public void turnOn() {  //besides turning the tv on, also resets the channel to 3 and the volume level to 2
	this.isOn = true;
	this.currentChannel = 3;
	this.currentVolume = 2;
		
		
	}	
		
	public void changeChannel(int newChannel) { // changes the current channel (only if it is on) to the value of newChannel as long as it is between 3 and 18
	if(isOn) {
		if(newChannel >= 3 && newChannel  <= 18) {
		this.currentChannel = newChannel;
	}
		this.currentChannel += 0;
	}
	this.currentChannel += 0;
	}	
	
	public void channelUp() {
	//increases the current channel by 1 (only if it is on). If the value goes past 18, then the current channel should be set to 3.
	if(isOn) {
		this.currentChannel += 1;
		if(this.currentChannel > 18) {
			this.currentChannel = 3;
		}
		this.currentChannel += 0;
	}
	}
	public void channelDown() {
	//decreases the current channel by 1 (only if it is on). If the value goes below 3, then the current channel should be set to 18.
	if(isOn) {
		this.currentChannel -= 1;
		if(this.currentChannel < 3) {
			this.currentChannel = 18;
		}
		this.currentChannel -= 0;
	}
	}	
	public void raiseVolume() {
	 //increases the volume by 1 (only if it is on). The limit is 10
		if(isOn) {
			if(this.currentVolume < 10) {
			this.currentVolume += 1;
		}
		this.currentVolume += 0;
	}
	}		
	public void lowerVolume() {
	//decreases the volume by 1 (only if it is on). The limit is 0
		if(isOn) {
			if(this.currentVolume > 0) {
				this.currentVolume -= 1;
			}
			this.currentVolume -= 0;
		}
	}

}
