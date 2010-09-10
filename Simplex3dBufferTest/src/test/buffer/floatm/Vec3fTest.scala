/*
 * Simplex3d, BufferTest package
 * Copyright (C) 2010, Simplex3d Team
 *
 * This file is part of Simplex3dBufferTest.
 *
 * Simplex3dBufferTest is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Simplex3dBufferTest is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package test.buffer
package floatm

import org.scalatest._
import simplex3d.math.floatm._
import simplex3d.buffer._
import simplex3d.buffer.floatm._

import Descriptors._
import FactoryTest._


/**
 * @author Aleksey Nikiforov (lex)
 */
class Vec3fTest extends FunSuite {

  test("Factories") {
    testArrayFromSize(DataArray[Vec3f, SByte](_))
    testArrayFromData[Vec3f, SByte](DataArray[Vec3f, SByte](_))
    testBufferFromSize(DataBuffer[Vec3f, SByte](_))
    testBufferFromData(DataBuffer[Vec3f, SByte](_))
    testViewFromData(DataView[Vec3f, SByte](_, _, _))
    testReadBufferFromData(ReadDataBuffer[Vec3f, SByte](_))
    testReadViewFromData(ReadDataView[Vec3f, SByte](_, _, _))

    testArrayFromSize(DataArray[Vec3f, UByte](_))
    testArrayFromData[Vec3f, UByte](DataArray[Vec3f, UByte](_))
    testBufferFromSize(DataBuffer[Vec3f, UByte](_))
    testBufferFromData(DataBuffer[Vec3f, UByte](_))
    testViewFromData(DataView[Vec3f, UByte](_, _, _))
    testReadBufferFromData(ReadDataBuffer[Vec3f, UByte](_))
    testReadViewFromData(ReadDataView[Vec3f, UByte](_, _, _))

    testArrayFromSize(DataArray[Vec3f, SShort](_))
    testArrayFromData[Vec3f, SShort](DataArray[Vec3f, SShort](_))
    testBufferFromSize(DataBuffer[Vec3f, SShort](_))
    testBufferFromData(DataBuffer[Vec3f, SShort](_))
    testViewFromData(DataView[Vec3f, SShort](_, _, _))
    testReadBufferFromData(ReadDataBuffer[Vec3f, SShort](_))
    testReadViewFromData(ReadDataView[Vec3f, SShort](_, _, _))

    testArrayFromSize(DataArray[Vec3f, UShort](_))
    testArrayFromData[Vec3f, UShort](DataArray[Vec3f, UShort](_))
    testBufferFromSize(DataBuffer[Vec3f, UShort](_))
    testBufferFromData(DataBuffer[Vec3f, UShort](_))
    testViewFromData(DataView[Vec3f, UShort](_, _, _))
    testReadBufferFromData(ReadDataBuffer[Vec3f, UShort](_))
    testReadViewFromData(ReadDataView[Vec3f, UShort](_, _, _))

    testArrayFromSize(DataArray[Vec3f, SInt](_))
    testArrayFromData[Vec3f, SInt](DataArray[Vec3f, SInt](_))
    testBufferFromSize(DataBuffer[Vec3f, SInt](_))
    testBufferFromData(DataBuffer[Vec3f, SInt](_))
    testViewFromData(DataView[Vec3f, SInt](_, _, _))
    testReadBufferFromData(ReadDataBuffer[Vec3f, SInt](_))
    testReadViewFromData(ReadDataView[Vec3f, SInt](_, _, _))

    testArrayFromSize(DataArray[Vec3f, UInt](_))
    testArrayFromData[Vec3f, UInt](DataArray[Vec3f, UInt](_))
    testBufferFromSize(DataBuffer[Vec3f, UInt](_))
    testBufferFromData(DataBuffer[Vec3f, UInt](_))
    testViewFromData(DataView[Vec3f, UInt](_, _, _))
    testReadBufferFromData(ReadDataBuffer[Vec3f, UInt](_))
    testReadViewFromData(ReadDataView[Vec3f, UInt](_, _, _))

    testArrayFromSize(DataArray[Vec3f, HalfFloat](_))
    testArrayFromData[Vec3f, HalfFloat](DataArray[Vec3f, HalfFloat](_))
    testBufferFromSize(DataBuffer[Vec3f, HalfFloat](_))
    testBufferFromData(DataBuffer[Vec3f, HalfFloat](_))
    testViewFromData(DataView[Vec3f, HalfFloat](_, _, _))
    testReadBufferFromData(ReadDataBuffer[Vec3f, HalfFloat](_))
    testReadViewFromData(ReadDataView[Vec3f, HalfFloat](_, _, _))

    testArrayFromSize(DataArray[Vec3f, RawFloat](_))
    testArrayFromData[Vec3f, RawFloat](DataArray[Vec3f, RawFloat](_))
    testBufferFromSize(DataBuffer[Vec3f, RawFloat](_))
    testBufferFromData(DataBuffer[Vec3f, RawFloat](_))
    testViewFromData(DataView[Vec3f, RawFloat](_, _, _))
    testReadBufferFromData(ReadDataBuffer[Vec3f, RawFloat](_))
    testReadViewFromData(ReadDataView[Vec3f, RawFloat](_, _, _))
  }
}