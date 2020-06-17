import React from 'react';
import styled from 'styled-components'

import TitleInput from '@Components/IssueCreate/TitleInput'
import ContentsEditor from '@Components/IssueCreate/ContentsEditor'
import CancelButton from '@Components/IssueCreate/CancelButton'
import SubmitButton from '@Components/IssueCreate/SubmitButton'

const IssueCreateWrap = styled.div`
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 0px 5px;
`;

const IssueCreate = ({ onTitleChange, onContentsChange, onCancelButtonClick, onSubmitButtonClick }) => {
  return (
    <>
      <TitleInput onTextChange={onTitleChange} />
      <ContentsEditor onTextChange={onContentsChange}/>
      <IssueCreateWrap>
        <CancelButton onButtonClick={onCancelButtonClick}/>
        <SubmitButton onButtonClick={onSubmitButtonClick}/>
      </IssueCreateWrap>
    </>
  );
};

export default IssueCreate;
