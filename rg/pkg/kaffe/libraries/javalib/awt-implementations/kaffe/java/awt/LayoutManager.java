/* LayoutManager.java -- lay out elements in a Container
   Copyright (C) 1999, 2002 Free Software Foundation, Inc.

This file is part of GNU Classpath.

GNU Classpath is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.

GNU Classpath is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with GNU Classpath; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
02110-1301 USA.

Linking this library statically or dynamically with other modules is
making a combined work based on this library.  Thus, the terms and
conditions of the GNU General Public License cover the whole
combination.

As a special exception, the copyright holders of this library give you
permission to link this library with independent modules to produce an
executable, regardless of the license terms of these independent
modules, and to copy and distribute the resulting executable under
terms of your choice, provided that you also meet, for each linked
independent module, the terms and conditions of the license of that
module.  An independent module is a module which is not derived from
or based on this library.  If you modify this library, you may extend
this exception to your version of the library, but you are not
obligated to do so.  If you do not wish to do so, delete this
exception statement from your version. */


package java.awt;

/**
 * This interface is for laying out containers in a particular sequence.
 *
 * @author Aaron M. Renn <arenn@urbanophile.com>
 * @see Container
 * @since 1.0
 * @status updated to 1.4
 */
public interface LayoutManager
{
  /**
   * Adds the specified component to the layout group.
   *
   * @param name the name of the component to add
   * @param component the component to add
   */
  void addLayoutComponent(String name, Component component);

  /**
   * Removes the specified component from the layout group.
   *
   * @param component the component to remove
   */
  void removeLayoutComponent(Component component);

  /**
   * Calculates the preferred size for this container, taking into account
   * the components it contains.
   *
   * @param parent the parent container to lay out
   * @return the preferred dimensions of this container
   * @see #minimumLayoutSize(Container)
   */
  Dimension preferredLayoutSize(Container parent);

  /**
   * Calculates the minimum size for this container, taking into account
   * the components it contains.
   *
   * @param parent the parent container to lay out
   * @return the minimum dimensions of this container
   * @see #preferredLayoutSize(Container)
   */
  Dimension minimumLayoutSize(Container parent);

  /**
   * Lays out the components in the given container.
   *
   * @param parent the container to lay out
   */
  void layoutContainer(Container parent);
} // interface LayoutManager
