/* 
 * Copyright 2008-2011 Mohawk College of Applied Arts and Technology
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you 
 * may not use this file except in compliance with the License. You may 
 * obtain a copy of the License at 
 * 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the 
 * License for the specific language governing permissions and limitations under 
 * the License.
 * 
 * User: Justin Fyfe
 * Date: 06-24-2011
 */
package org.marc.everest.interfaces;

import org.marc.everest.datatypes.*;
import org.marc.everest.datatypes.generic.*;


/**
 * Identifies that a class has a nullflavor. This interface is used primarily by data types that implement the 
 * concept of a null flavor
 */
public interface IImplementsNullFlavor 
{

	/**
	 * Get the nullFlavor of the object 
	 */
	CS<NullFlavor> getNullFlavor();
	
	/**
	 * Sets the null flavor
	 * @param nullFlavor
	 */
	void setNullFlavor(CS<NullFlavor> nullFlavor);
}
