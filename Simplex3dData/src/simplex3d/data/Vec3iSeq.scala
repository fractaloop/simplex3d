/*
 * Simplex3d, CoreData module
 * Copyright (C) 2010-2011, Aleksey Nikiforov
 *
 * This file is part of Simplex3dData.
 *
 * Simplex3dData is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Simplex3dData is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package simplex3d.data

import java.nio._
import scala.annotation.unchecked._
import simplex3d.math._


/**
 * @author Aleksey Nikiforov (lex)
 */
private[data] abstract class BaseVec3i[+R <: DefinedInt](
  prim: ReadContiguous[SInt, R], off: Int, str: Int
) extends CompositeSeq[Vec3i, R, DefinedInt](prim, off, str) {
  final def elemManifest = Vec3i.Manifest
  final def readManifest = Vec3i.ReadManifest
  final def components: Int = 3

  final def mkReadDataArray[P <: DefinedInt](prim: ReadDataArray[Vec3i#Component, P])
  :ReadDataArray[Vec3i, P] = new ArrayVec3i(prim)
  final def mkReadDataBuffer[P <: DefinedInt](prim: ReadDataBuffer[Vec3i#Component, P])
  :ReadDataBuffer[Vec3i, P] = new BufferVec3i(prim)
  protected final def mkReadDataViewInstance[P <: DefinedInt](
    prim: ReadDataBuffer[Vec3i#Component, P], off: Int, str: Int
  ) :ReadDataView[Vec3i, P] = new ViewVec3i(prim, off, str)

  final override def mkSerializableInstance() = new CompositeSInt(components)
}

private[data] final class ArrayVec3i[+R <: DefinedInt](
  prim: ReadDataArray[SInt, R]
) extends BaseVec3i[R](prim, 0, 3) with DataArray[Vec3i, R] {
  def apply(i: Int) :ConstVec3i = {
    val j = i*3
    ConstVec3i(
      primitive(j),
      primitive(j + 1),
      primitive(j + 2)
    )
  }
  def update(i: Int, v: ReadVec3i) {
    val j = i*3
    primitive(j) = v.x
    primitive(j + 1) = v.y
    primitive(j + 2) = v.z
  }
}

private[data] final class BufferVec3i[+R <: DefinedInt](
  prim: ReadDataBuffer[SInt, R]
) extends BaseVec3i[R](prim, 0, 3) with DataBuffer[Vec3i, R] {
  def apply(i: Int) :ConstVec3i = {
    val j = i*3
    ConstVec3i(
      primitive(j),
      primitive(j + 1),
      primitive(j + 2)
    )
  }
  def update(i: Int, v: ReadVec3i) {
    val j = i*3
    primitive(j) = v.x
    primitive(j + 1) = v.y
    primitive(j + 2) = v.z
  }
}

private[data] final class ViewVec3i[+R <: DefinedInt](
  prim: ReadDataBuffer[SInt, R], off: Int, str: Int
) extends BaseVec3i[R](prim, off, str) with DataView[Vec3i, R] {
  def apply(i: Int) :ConstVec3i = {
    val j = offset + i*stride
    ConstVec3i(
      primitive(j),
      primitive(j + 1),
      primitive(j + 2)
    )
  }
  def update(i: Int, v: ReadVec3i) {
    val j = offset + i*stride
    primitive(j) = v.x
    primitive(j + 1) = v.y
    primitive(j + 2) = v.z
  }
}