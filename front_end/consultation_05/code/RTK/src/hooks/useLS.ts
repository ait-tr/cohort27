import { useEffect, useState } from 'react';

function getSavedValue<T>(key: string, defaultValue: T): T {
  const savedValue = localStorage.getItem(key);
  return (savedValue !== null ? JSON.parse(savedValue) : defaultValue);
}

function useLocalStorage<T>(key: string, initialValue: T): [T, React.Dispatch<React.SetStateAction<T>>] {
  const [value, setValue] = useState<T>(() => getSavedValue(key, initialValue));

  useEffect(() => {
    localStorage.setItem(key, JSON.stringify(value));
  }, [key, value]);

  return [value, setValue];
}

export default useLocalStorage;


