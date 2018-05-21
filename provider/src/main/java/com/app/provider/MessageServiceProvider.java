package com.app.provider;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
@Path("/provider")
public class MessageServiceProvider {
@Path("/msg")
@GET
public String ShowMsg()
{
	return "welcome to rest:";
}
}
