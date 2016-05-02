package org.sush.javamaven.messenger.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;


@Path("/")
public class CommentResource {
	
	@GET
	public String test(){
		return "test sun resource";
	}
	
	@GET
	@Path("/{commentId}")
	public String test2(@PathParam("messageId") long messageId, @PathParam("commentId") long commentId){
		return "message id " + messageId + "comment id " + commentId;
	}

}