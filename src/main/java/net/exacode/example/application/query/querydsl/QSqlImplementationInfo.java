package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QSqlImplementationInfo is a Querydsl query type for QSqlImplementationInfo
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QSqlImplementationInfo extends com.mysema.query.sql.RelationalPathBase<QSqlImplementationInfo> {

    private static final long serialVersionUID = 1527509546;

    public static final QSqlImplementationInfo sqlImplementationInfo = new QSqlImplementationInfo("sql_implementation_info");

    public final SimplePath<Object> characterValue = createSimple("character_value", Object.class);

    public final SimplePath<Object> comments = createSimple("comments", Object.class);

    public final SimplePath<Object> implementationInfoId = createSimple("implementation_info_id", Object.class);

    public final SimplePath<Object> implementationInfoName = createSimple("implementation_info_name", Object.class);

    public final SimplePath<Object> integerValue = createSimple("integer_value", Object.class);

    public QSqlImplementationInfo(String variable) {
        super(QSqlImplementationInfo.class, forVariable(variable), "information_schema", "sql_implementation_info");
    }

    @SuppressWarnings("all")
    public QSqlImplementationInfo(Path<? extends QSqlImplementationInfo> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "sql_implementation_info");
    }

    public QSqlImplementationInfo(PathMetadata<?> metadata) {
        super(QSqlImplementationInfo.class, metadata, "information_schema", "sql_implementation_info");
    }

}

