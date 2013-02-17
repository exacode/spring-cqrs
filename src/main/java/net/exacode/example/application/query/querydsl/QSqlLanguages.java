package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QSqlLanguages is a Querydsl query type for QSqlLanguages
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QSqlLanguages extends com.mysema.query.sql.RelationalPathBase<QSqlLanguages> {

    private static final long serialVersionUID = 1588148785;

    public static final QSqlLanguages sqlLanguages = new QSqlLanguages("sql_languages");

    public final SimplePath<Object> sqlLanguageBindingStyle = createSimple("sql_language_binding_style", Object.class);

    public final SimplePath<Object> sqlLanguageConformance = createSimple("sql_language_conformance", Object.class);

    public final SimplePath<Object> sqlLanguageImplementation = createSimple("sql_language_implementation", Object.class);

    public final SimplePath<Object> sqlLanguageIntegrity = createSimple("sql_language_integrity", Object.class);

    public final SimplePath<Object> sqlLanguageProgrammingLanguage = createSimple("sql_language_programming_language", Object.class);

    public final SimplePath<Object> sqlLanguageSource = createSimple("sql_language_source", Object.class);

    public final SimplePath<Object> sqlLanguageYear = createSimple("sql_language_year", Object.class);

    public QSqlLanguages(String variable) {
        super(QSqlLanguages.class, forVariable(variable), "information_schema", "sql_languages");
    }

    @SuppressWarnings("all")
    public QSqlLanguages(Path<? extends QSqlLanguages> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "sql_languages");
    }

    public QSqlLanguages(PathMetadata<?> metadata) {
        super(QSqlLanguages.class, metadata, "information_schema", "sql_languages");
    }

}

