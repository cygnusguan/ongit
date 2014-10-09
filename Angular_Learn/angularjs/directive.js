/*
angular.module("exampleApp").directive("triButton",function(){
	return {
		scope: {counter: "=counter"},
		link: function(scope,element,attrs){
			element.on("click", function(event){
				console.log("Button click:"+event.target.innerText);
				scope.$apply(function(){
					scope.counter++;
				});
			});
		}
	};
});
*/

var baseLogger=function(){
	this.messageCount=0;
	this.log=function(msg){
		console.log(this.msgType+":"+(this.messageCount++) + " " + msg);
	};
};

var errorLogger = function(){};
errorLogger.prototype=new baseLogger();
errorLogger.prototype.msgType="Error";

angular.module("customSuit",[])
.directive("triButton",function(){
	return{
		scope:{counter:"=counter"},
		link:function(scope,element,attr){
			element.on("click",function(event){
				console.log("button click:"+ event.target.innerText);
				scope.$apply(function(){
					scope.counter++;
				});
			});
		}
	}
})
/*
.factory("logService",function(){
	var messageCount=0;
	return{
		log:function(msg){
			console.log("(LOG +" + messageCount++ + ")" + msg);
		}
	};
})
.service("logService",function(){
	messageCount=0;
	return{
		log:function(msg){
			console.log("Debug"+":"+(messageCount++) + " " + msg);
		}
	};
})
*/
.service("errorService",errorLogger)
.provider("logService",function(){
	var counter=true;
	var debug=true;
	return {
		messageCounterEnabled:function(setting){
			if(angular.isDefined(setting)){
				counter=setting;
				return this;
			} else {
				return counter;
			}
		},
		debugEnabled:function(setting){
			if(angular.isDefined(setting)){
				debug=setting;
				return this;
			}else{
				return debug;
			}
		},
		$get:function(){
			return{
				messageCount:0,
				log:function(msg){
					if(debug){
						console.log("(LOG"+ (counter?"+"+this.messageCount++ + ")":")") + msg);
					}
				}
			};
		}
	};
});
