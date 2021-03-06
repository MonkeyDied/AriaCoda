/*
Adept MobileRobots Robotics Interface for Applications (ARIA)
Copyright (C) 2004-2005 ActivMedia Robotics LLC
Copyright (C) 2006-2010 MobileRobots Inc.
Copyright (C) 2011-2015 Adept Technology, Inc.
Copyright (C) 2016-2018 Omron Adept Technologies, Inc.

     This program is free software; you can redistribute it and/or modify
     it under the terms of the GNU General Public License as published by
     the Free Software Foundation; either version 2 of the License, or
     (at your option) any later version.

     This program is distributed in the hope that it will be useful,
     but WITHOUT ANY WARRANTY; without even the implied warranty of
     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
     GNU General Public License for more details.

     You should have received a copy of the GNU General Public License
     along with this program; if not, write to the Free Software
     Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA

If you wish to redistribute ARIA under different terms, contact 
Adept MobileRobots for information about a commercial version of ARIA at 
robots@mobilerobots.com or 
Adept MobileRobots, 10 Columbia Drive, Amherst, NH 03031; +1-603-881-7960
*/
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.ArNetworking;
import com.mobilerobots.Aria.*;
public class ArFunctor_ServerClient extends ArFunctor {
  private transient long swigCPtr;

  public ArFunctor_ServerClient(long cPtr, boolean cMemoryOwn) {
    super(ArNetworkingJavaJNI.ArFunctor_ServerClient_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArFunctor_ServerClient obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ArNetworkingJavaJNI.delete_ArFunctor_ServerClient(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    ArNetworkingJavaJNI.ArFunctor_ServerClient_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    ArNetworkingJavaJNI.ArFunctor_ServerClient_change_ownership(this, swigCPtr, true);
  }

  public void invoke() {
    ArNetworkingJavaJNI.ArFunctor_ServerClient_invoke__SWIG_0(swigCPtr, this);
  }

  public void invoke(ArServerClient p1) {
    ArNetworkingJavaJNI.ArFunctor_ServerClient_invoke__SWIG_1(swigCPtr, this, ArServerClient.getCPtr(p1), p1);
  }

  public ArFunctor_ServerClient() {
    this(ArNetworkingJavaJNI.new_ArFunctor_ServerClient(), true);
    ArNetworkingJavaJNI.ArFunctor_ServerClient_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}
