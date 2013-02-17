package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QForeignDataWrappers is a Querydsl query type for QForeignDataWrappers
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QForeignDataWrappers extends com.mysema.query.sql.RelationalPathBase<QForeignDataWrappers> {

    private static final long serialVersionUID = -88284614;

    public static final QForeignDataWrappers foreignDataWrappers = new QForeignDataWrappers("foreign_data_wrappers");

    public final SimplePath<Object> authorizationIdentifier = createSimple("authorization_identifier", Object.class);

    public final SimplePath<Object> foreignDataWrapperCatalog = createSimple("foreign_data_wrapper_catalog", Object.class);

    public final SimplePath<Object> foreignDataWrapperLanguage = createSimple("foreign_data_wrapper_language", Object.class);

    public final SimplePath<Object> foreignDataWrapperName = createSimple("foreign_data_wrapper_name", Object.class);

    public final SimplePath<Object> libraryName = createSimple("library_name", Object.class);

    public QForeignDataWrappers(String variable) {
        super(QForeignDataWrappers.class, forVariable(variable), "information_schema", "foreign_data_wrappers");
    }

    @SuppressWarnings("all")
    public QForeignDataWrappers(Path<? extends QForeignDataWrappers> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "foreign_data_wrappers");
    }

    public QForeignDataWrappers(PathMetadata<?> metadata) {
        super(QForeignDataWrappers.class, metadata, "information_schema", "foreign_data_wrappers");
    }

}

