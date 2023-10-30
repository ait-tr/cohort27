import React, { useState } from 'react';
import styles from './TodoList.module.css';

const TodoList: React.FC = () => {
  const [todos, setTodos] = useState<string[]>([]);
  const [newTodo, setNewTodo] = useState<string>('');

  const handleAddTodo = (): void => {
    if (newTodo) {
      setTodos([...todos, newTodo]);
      setNewTodo('');
    }
  };

  const handleRemoveTodo = (index: number): void => {
    const updatedTodos = todos.filter((_, i) => i !== index);
    setTodos(updatedTodos);
  };

  return (
    <div className={styles.todoContainer}>
      <h2>Skeuomorphic Todo List</h2>
      <input
        className={styles.todoInput}
        type="text"
        placeholder="Add a new todo"
        value={newTodo}
        onChange={(e) => setNewTodo(e.target.value)}
      />
      <button onClick={handleAddTodo}>Add</button>
      <ul>
        {todos.map((todo, index) => (
          <li key={index} className={styles.todoItem}>
            {todo}
            <button onClick={() => handleRemoveTodo(index)}>Remove</button>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default TodoList;
