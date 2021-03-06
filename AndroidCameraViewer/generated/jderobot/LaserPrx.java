// **********************************************************************
//
// Copyright (c) 2003-2013 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.5.1
//
// <auto-generated>
//
// Generated from file `laser.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

/**
 * Interface to the Gazebo laser sensor.
 **/
public interface LaserPrx extends Ice.ObjectPrx
{
    public LaserData getLaserData();

    public LaserData getLaserData(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getLaserData();

    public Ice.AsyncResult begin_getLaserData(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getLaserData(Ice.Callback __cb);

    public Ice.AsyncResult begin_getLaserData(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getLaserData(Callback_Laser_getLaserData __cb);

    public Ice.AsyncResult begin_getLaserData(java.util.Map<String, String> __ctx, Callback_Laser_getLaserData __cb);

    public LaserData end_getLaserData(Ice.AsyncResult __result);
}
